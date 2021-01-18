package ru.bagrusss.weatherapp.data.net.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Daily(
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
    val feelsLike: FeelsLike,
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
    @Json(name = "rain")
    val rain: Double,
    @JvmField
    @Json(name = "snow")
    val snow: Double,
    @JvmField
    @Json(name = "sunrise")
    val sunrise: Int,
    @JvmField
    @Json(name = "sunset")
    val sunset: Int,
    @JvmField
    @Json(name = "temp")
    val temp: Temp,
    @JvmField
    @Json(name = "uvi")
    val uvi: Double,
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