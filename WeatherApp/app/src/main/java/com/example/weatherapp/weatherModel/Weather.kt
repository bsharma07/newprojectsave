package com.example.weatherapp.weatherModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Weather(
    @SerializedName("id")
    @Expose
    var id: Int? = null,

    @SerializedName("days")
    @Expose
    var days: List<Day>? = null
)