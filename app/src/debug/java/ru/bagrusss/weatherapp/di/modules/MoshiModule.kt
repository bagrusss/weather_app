package ru.bagrusss.weatherapp.di.modules

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class MoshiModule {

    @Module
    companion object {

        @Provides
        @Singleton
        @JvmStatic
        fun provideMoshi(): Moshi {
            return Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()
        }
    }

}