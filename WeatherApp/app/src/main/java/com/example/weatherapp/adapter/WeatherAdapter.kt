package com.example.weatherapp.adapter;

import com.example.weatherapp.R
import com.example.weatherapp.weatherModel.HourlyWeather



import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class WeatherAdapter (

    val context: Context):RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>(){

    var weatherList: List<HourlyWeather> = emptyList()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val v= LayoutInflater.from(parent.context)
            .inflate(R.layout.hourly_info, parent,false)
        return WeatherViewHolder(v)
    }

    override fun getItemCount(): Int {
        return weatherList.size
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        val currentTemp= weatherList[position]
        holder.temp.text =currentTemp.temperature.toString()
        holder.wSpeed.text=currentTemp.windSpeed.toString()
        //holder.wType.text=currentTemp.weatherType
        holder.humidity.text=currentTemp.humidity.toString()
        holder.hour.text= currentTemp.hour.toString()
        holder.rChance.text=currentTemp.rainChance.toString()

    }

    class WeatherViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var temp:TextView
        var wSpeed:TextView

        var humidity:TextView
        var hour:TextView
        var rChance:TextView

        init{
            temp =itemView.findViewById(R.id.temp)
            wSpeed=itemView.findViewById(R.id.windspeed)

            humidity= itemView.findViewById(R.id.humidity)
            hour= itemView.findViewById(R.id.time)
            rChance=itemView.findViewById(R.id.coR)
        }

    }
}
