package ru.bagrusss.weatherapp.data.net.models

import com.squareup.moshi.Json


data class WeatherResponseDto(
    @JvmField
    @Json(name = "cod") val code: Int,

    @JvmField
    @Json(name = "cnt") val count: Int,

    @JvmField
    @Json(name = "list") val list: List<WeatherItemDto>
)

data class WeatherItemDto(
    @JvmField
    @Json(name = "dt") val timestamp: Long,

    @JvmField
    @Json(name = "visibility") val visibility: Int,
)
