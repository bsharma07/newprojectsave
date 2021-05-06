package com.example.weatherapp.weatherModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class AndroidImageURLs (
    @SerializedName("xhdpiImageURL")
    @Expose
    var xhdpiImageURL: String? = null,

    @SerializedName("hdpiImageURL")
    @Expose
    var hdpiImageURL: String? = null,

    @SerializedName("mdpiImageURL")
    @Expose
    var mdpiImageURL: String? = null
    )