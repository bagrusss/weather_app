package ru.bagrusss.weatherapp.data.net.services

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query
import ru.bagrusss.weatherapp.data.net.models.OneCallResponseDto

interface WeatherService {

    @GET("onecall")
    fun oneCall(
        @Query("lat") lat: Float,
        @Query("lon") lon: Float,
        @Query("exclude") exclude: String,
        @Query("appid") appId: String,
        @Query("units") units: String
    ): Single<OneCallResponseDto>

}