package com.example.weatherapp.searchModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Search(
    @SerializedName("totalCitiesFound")
    @Expose
    var totalCitiesFound: Int? = null,

    @SerializedName("startIndex")
    @Expose
    var startIndex: Int? = null,

    @SerializedName("cities")
    @Expose
    var cities: List<City>? = null
)
