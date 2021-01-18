package ru.bagrusss.weatherapp.di.modules

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import io.reactivex.rxjava3.schedulers.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import ru.bagrusss.weatherapp.data.net.services.WeatherService
import javax.inject.Singleton

@Module(
    includes = [
        MoshiModule::class,
        OkHttpModule::class
    ]
)
abstract class NetModule {

    @Module
    companion object {

        const val BASE_URL = "https://api.openweathermap.org/data/2.5/"

        @Provides
        @Singleton
        @JvmStatic
        fun provideRetrofit(client: OkHttpClient, moshi: Moshi): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addCallAdapterFactory(RxJava3CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build()
        }

        @Provides
        @Singleton
        @JvmStatic
        fun provideWeatherService(retrofit: Retrofit): WeatherService = retrofit.create(WeatherService::class.java)

    }

}