package ru.bagrusss.weatherapp.di.modules

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
abstract class OkHttpModule {

    @Module
    companion object {

        @Provides
        @Singleton
        @JvmStatic
        fun provideOkHttp(): OkHttpClient {
            return OkHttpClient.Builder()
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build()
        }
    }

}