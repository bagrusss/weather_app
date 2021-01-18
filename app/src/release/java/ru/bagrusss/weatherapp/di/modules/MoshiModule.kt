package ru.bagrusss.weatherapp.di.modules

import com.squareup.moshi.Moshi
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
                .build()
        }
    }

}