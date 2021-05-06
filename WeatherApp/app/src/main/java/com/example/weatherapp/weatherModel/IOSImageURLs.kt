package com.example.weatherapp.weatherModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class IOSImageURLs (
    @SerializedName("imageURL")
    @Expose
    var imageURL: String? = null
)
