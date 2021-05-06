package com.example.weatherapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.weatherapp.R
import com.example.weatherapp.adapter.WeatherAdapter

import com.example.weatherapp.repositories.WeatherRepository
import com.example.weatherapp.viewmodel.WeatherViewModel
import com.example.weatherapp.viewmodel.WeatherViewModelFactory
import com.example.weatherapp.weatherModel.Root

class MainActivity : AppCompatActivity() {
    private val repository = WeatherRepository()
    private val viewModelFactory by lazy {
        WeatherViewModelFactory(repository)
    }
    private val viewmodel by lazy {
        ViewModelProvider(this, viewModelFactory).get(WeatherViewModel::class.java)
    }
    lateinit var recyclerView: RecyclerView
    private lateinit var weathersAdapter: WeatherAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        var cityName: TextView = findViewById(R.id.name)
        var dateTimeTextView: TextView = findViewById(R.id.date_text)
        var tempTextView: TextView = findViewById(R.id.temperature)
        var cityImage: ImageView = findViewById(R.id.img)

        //todo viewModel
        viewmodel.weather.observe(this, object : Observer<Root> {
            override fun onChanged(t: Root?) {
                cityName.text = t?.city?.name!!
                dateTimeTextView.text = t?.city?.modificationDate
                tempTextView.text =
                    t?.weather?.days?.get(0)?.hourlyWeather?.get(0)?.temperature!!.toString()
                Glide.with(applicationContext).load(t.city?.imageURLs?.androidImageURLs?.xhdpiImageURL!!).into(cityImage)

                weathersAdapter.weatherList = t!!.weather!!.days!![0].hourlyWeather!!
                recyclerView.adapter=weathersAdapter
            }


        })

    }

    fun initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.apply {
            layoutManager =
                LinearLayoutManager(
                    context, RecyclerView.VERTICAL, false
                )
            weathersAdapter = WeatherAdapter(context)
            adapter = weathersAdapter
        }
    }
}