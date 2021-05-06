package com.example.weatherapp.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp.repositories.WeatherRepository
import com.example.weatherapp.util.coroutine
import com.example.weatherapp.weatherModel.Root

class WeatherViewModel(val myRepository: WeatherRepository) : ViewModel() {
    var weather = MutableLiveData<Root>()

    init {
        refreshList()
    }

    fun refreshList() {
        coroutine{
            val response = myRepository.getWeather()
            if (response.isSuccessful) {
                response.body()?.let { weather.postValue(response.body()) }
            } else {
                Log.e("GDI", response.errorBody().toString())
            }
        }
    }


}