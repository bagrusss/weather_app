package ru.bagrusss.weatherapp.data.net.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Weather(
    @JvmField
    @Json(name = "description")
    val description: String,
    @JvmField
    @Json(name = "icon")
    val icon: String,
    @JvmField
    @Json(name = "id")
    val id: Int,
    @JvmField
    @Json(name = "main")
    val main: String
)