package ru.bagrusss.weatherapp.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.bagrusss.arch.rx_mvi.common.LazySingletonHolder
import ru.bagrusss.arch.rx_mvi.di.api.core.CoreApi
import ru.bagrusss.weatherapp.di.modules.AppModule
import ru.bagrusss.weatherapp.di.modules.NetModule
import ru.bagrusss.weatherapp.ui.flow.home.screens.cities.di.CitiesFragmentInjector
import ru.bagrusss.weatherapp.ui.flow.home.screens.detailed_weather.di.DetailedWeatherFragmentInjector
import ru.bagrusss.weatherapp.ui.flow.home.screens.map.di.MapFragmentInjector
import ru.bagrusss.weatherapp.ui.flow.home.screens.settings.di.SettingsFragmentInjector
import ru.bagrusss.weatherapp.ui.flow.home.screens.weather.di.WeatherFragmentInjector
import javax.inject.Singleton

interface AppApi :
    WeatherFragmentInjector,
    SettingsFragmentInjector,
    CitiesFragmentInjector,
    MapFragmentInjector,
    DetailedWeatherFragmentInjector {

}

@Singleton
@Component(
    dependencies = [
        CoreApi::class
    ],
    modules = [
        NetModule::class,
        AppModule::class
    ]
)
interface AppComponent : AppApi {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun coreApi(coreApi: CoreApi): Builder

        fun build(): AppComponent

    }

}

data class AppArgs(
    @JvmField val context: Context,
    @JvmField val coreApi: CoreApi
)

object AppProvider : LazySingletonHolder<AppApi, AppArgs>({ args ->
    DaggerAppComponent.builder()
        .context(args.context)
        .coreApi(args.coreApi)
        .build()
}) {

    internal val api: AppApi
        get() = instance

}
