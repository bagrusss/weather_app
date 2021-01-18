package ru.bagrusss.weatherapp.app

import android.app.Application
import ru.bagrusss.arch.rx_mvi.di.api.core.CoreApiProvider
import ru.bagrusss.arch.rx_mvi.di.api.core.CoreArgs
import ru.bagrusss.weatherapp.di.AppArgs
import ru.bagrusss.weatherapp.di.AppProvider

class WeatherApp: Application() {

    private fun initDi() {
        CoreApiProvider.init {
            CoreArgs(
                context = this
            )
        }

        AppProvider.init {
            AppArgs(
                this,
                CoreApiProvider.instance
            )
        }
    }

}