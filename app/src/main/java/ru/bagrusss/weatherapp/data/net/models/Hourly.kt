package ru.bagrusss.weatherapp.data.net.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Hourly(
    @JvmField
    @Json(name = "clouds")
    val clouds: Int,
    @JvmField
    @Json(name = "dew_point")
    val dewPoint: Double,
    @JvmField
    @Json(name = "dt")
    val dt: Int,
    @JvmField
    @Json(name = "feels_like")
    val feelsLike: Double,
    @JvmField
    @Json(name = "humidity")
    val humidity: Int,
    @JvmField
    @Json(name = "pop")
    val pop: Int,
    @JvmField
    @Json(name = "pressure")
    val pressure: Int,
    @JvmField
    @Json(name = "temp")
    val temp: Double,
    @JvmField
    @Json(name = "uvi")
    val uvi: Int,
    @JvmField
    @Json(name = "visibility")
    val visibility: Int,
    @JvmField
    @Json(name = "weather")
    val weather: List<Weather>,
    @JvmField
    @Json(name = "wind_deg")
    val windDeg: Int,
    @JvmField
    @Json(name = "wind_speed")
    val windSpeed: Double
)