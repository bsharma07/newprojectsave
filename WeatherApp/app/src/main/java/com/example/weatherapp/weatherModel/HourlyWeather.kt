package com.example.weatherapp.weatherModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class HourlyWeather(
    @SerializedName("windSpeed")
    @Expose
    var windSpeed: Float? = null,

    @SerializedName("temperature")
    @Expose
    var temperature: Int? = null,

    @SerializedName("weatherType")
    @Expose
    var weatherType: String? = null,

    @SerializedName("humidity")
    @Expose
    var humidity: Float? = null,

    @SerializedName("hour")
    @Expose
    var hour: Int? = null,

    @SerializedName("rainChance")
    @Expose
    var rainChance: Float? = null
)