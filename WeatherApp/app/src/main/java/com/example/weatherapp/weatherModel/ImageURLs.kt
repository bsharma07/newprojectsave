package com.example.weatherapp.weatherModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class ImageURLs (
    @SerializedName("androidImageURLs")
    @Expose
    var androidImageURLs: AndroidImageURLs? = null,

    @SerializedName("iOSImageURLs")
    @Expose
    var iOSImageURLs: IOSImageURLs? = null
    )