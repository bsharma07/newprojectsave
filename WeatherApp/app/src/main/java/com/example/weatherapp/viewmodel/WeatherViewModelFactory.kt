package com.example.weatherapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.repositories.WeatherRepository

class WeatherViewModelFactory(val repository: WeatherRepository): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(WeatherRepository::class.java)
            .newInstance(repository)
    }
}