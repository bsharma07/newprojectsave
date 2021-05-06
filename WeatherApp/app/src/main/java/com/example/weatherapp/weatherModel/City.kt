package com.example.weatherapp.weatherModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class City (
    @SerializedName("name")
    @Expose
    var name: String? = null,

    @SerializedName("country code")
    @Expose
    var countryCode: String? = null,

    @SerializedName("alternatenames")
    @Expose
    var alternatenames: String? = null,

    @SerializedName("admin4 code")
    @Expose
    var admin4Code: String? = null,

    @SerializedName("elevation")
    @Expose
    var elevation: Int? = null,

    @SerializedName("imageURLs")
    @Expose
    var imageURLs: ImageURLs? = null,

    @SerializedName("geonameid")
    @Expose
    var geonameid: Int? = null,

    @SerializedName("modification date")
    @Expose
    var modificationDate: String? = null,

    @SerializedName("feature code")
    @Expose
    var featureCode: String? = null,

    @SerializedName("dem")
    @Expose
    var dem: Int? = null,

    @SerializedName("feature class")
    @Expose
    var featureClass: String? = null,

    @SerializedName("admin2 code")
    @Expose
    var admin2Code: Int? = null,

    @SerializedName("admin3 code")
    @Expose
    var admin3Code: Any? = null,

    @SerializedName("longitude")
    @Expose
    var longitude: Float? = null,

    @SerializedName("asciiname")
    @Expose
    var asciiname: String? = null,

    @SerializedName("latitude")
    @Expose
    var latitude: Float? = null,

    @SerializedName("timezone")
    @Expose
    var timezone: String? = null,

    @SerializedName("population")
    @Expose
    var population: Int? = null,

    @SerializedName("cc2")
    @Expose
    var cc2: String? = null,

    @SerializedName("admin1 code")
    @Expose
    var admin1Code: String? = null
    )
