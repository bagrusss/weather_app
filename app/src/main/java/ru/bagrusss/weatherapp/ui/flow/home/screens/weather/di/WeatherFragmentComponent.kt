package ru.bagrusss.weatherapp.ui.flow.home.screens.weather.di

import dagger.Subcomponent
import ru.bagrusss.arch.rx_mvi.di.FragmentComponent
import ru.bagrusss.arch.rx_mvi.di.FragmentScope
import ru.bagrusss.weatherapp.ui.flow.home.screens.weather.WeatherContract

@FragmentScope
@Subcomponent(
    modules = [
        WeatherModule::class
    ]
)
interface WeatherFragmentComponent : FragmentComponent {

    val viewModel: WeatherContract.ViewModel

    @Subcomponent.Builder
    interface Builder : FragmentComponent.Builder<WeatherFragmentComponent, Builder> {
    }

}