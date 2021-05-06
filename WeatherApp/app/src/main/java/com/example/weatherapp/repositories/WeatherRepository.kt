package com.example.weatherapp.repositories


import com.example.weatherapp.api.ApiService
import com.example.weatherapp.api.RetrofitClient
import com.example.weatherapp.searchModel.Search
import com.example.weatherapp.weatherModel.Root
import retrofit2.Response

class WeatherRepository {
    suspend fun getSearch(): Response<Search> {
        return RetrofitClient.getWeatherApi(ApiService::class.java).getSearch()
    }

    suspend fun getWeather(): Response<Root>{
        return RetrofitClient.getWeatherApi(ApiService::class.java).getCity()
    }
}
