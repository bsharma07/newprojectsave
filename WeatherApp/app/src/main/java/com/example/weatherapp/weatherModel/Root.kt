package com.example.weatherapp.weatherModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Root (
    @SerializedName("city")
    @Expose
    var city: City? = null,

    @SerializedName("weather")
    @Expose
    var weather: Weather? = null
    )