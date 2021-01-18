package ru.bagrusss.weatherapp.data.net.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OneCallResponseDto(
    @JvmField
    @Json(name = "current")
    val current: Current,
    @JvmField
    @Json(name = "daily")
    val daily: List<Daily>,
    @JvmField
    @Json(name = "hourly")
    val hourly: List<Hourly>,
    @JvmField
    @Json(name = "lat")
    val lat: Double,
    @JvmField
    @Json(name = "lon")
    val lon: Double,
    @JvmField
    @Json(name = "timezone")
    val timezone: String,
    @JvmField
    @Json(name = "timezone_offset")
    val timezoneOffset: Int
)