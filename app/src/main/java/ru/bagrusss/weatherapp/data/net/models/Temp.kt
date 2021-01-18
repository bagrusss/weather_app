package ru.bagrusss.weatherapp.data.net.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Temp(
    @JvmField
    @Json(name = "day")
    val day: Double,
    @JvmField
    @Json(name = "eve")
    val eve: Double,
    @JvmField
    @Json(name = "max")
    val max: Double,
    @JvmField
    @Json(name = "min")
    val min: Double,
    @JvmField
    @Json(name = "morn")
    val morn: Double,
    @JvmField
    @Json(name = "night")
    val night: Double
)