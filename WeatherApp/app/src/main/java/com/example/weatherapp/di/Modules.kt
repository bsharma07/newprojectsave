package com.example.weatherapp

import com.example.weatherapp.repositories.WeatherRepository
import org.koin.dsl.module

val applicationModule = module {
    single {
        WeatherRepository()
    }
}