package ru.bagrusss.weatherapp.data.net.services

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query
import ru.bagrusss.weatherapp.data.net.models.WeatherResponseDto

interface WeatherService {

    @GET("forecast")
    fun loadWeather(
        @Query("lat") lat: Float,
        @Query("lon") lon: Float,
        @Query("appid") appId: String,
        @Query("units") units: String
    ): Single<WeatherResponseDto>

}