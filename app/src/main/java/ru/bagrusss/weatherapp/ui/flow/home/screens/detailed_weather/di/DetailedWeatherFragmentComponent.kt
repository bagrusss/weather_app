package ru.bagrusss.weatherapp.ui.flow.home.screens.detailed_weather.di

import dagger.BindsInstance
import dagger.Subcomponent
import ru.bagrusss.arch.rx_mvi.di.FragmentComponent
import ru.bagrusss.arch.rx_mvi.di.FragmentScope
import ru.bagrusss.weatherapp.ui.flow.home.screens.detailed_weather.DetailedWeatherContract
import ru.bagrusss.weatherapp.ui.flow.home.screens.detailed_weather.DetailedWeatherContract.InputData

@FragmentScope
@Subcomponent(
    modules = [
        DetailedWeatherModule::class
    ]
)
interface DetailedWeatherFragmentComponent : FragmentComponent {

    val viewModel: DetailedWeatherContract.ViewModel

    @Subcomponent.Builder
    interface Builder : FragmentComponent.Builder<DetailedWeatherFragmentComponent, Builder> {
        
        @BindsInstance
        fun inputData(inputData: InputData): Builder
    }

}