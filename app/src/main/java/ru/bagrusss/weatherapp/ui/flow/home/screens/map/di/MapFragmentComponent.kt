package ru.bagrusss.weatherapp.ui.flow.home.screens.map.di

import dagger.BindsInstance
import dagger.Subcomponent
import ru.bagrusss.arch.rx_mvi.di.FragmentComponent
import ru.bagrusss.arch.rx_mvi.di.FragmentScope
import ru.bagrusss.weatherapp.ui.flow.home.screens.map.MapContract
import ru.bagrusss.weatherapp.ui.flow.home.screens.map.MapContract.InputData

@FragmentScope
@Subcomponent(
    modules = [
        MapModule::class
    ]
)
interface MapFragmentComponent : FragmentComponent {

    val viewModel: MapContract.ViewModel

    @Subcomponent.Builder
    interface Builder : FragmentComponent.Builder<MapFragmentComponent, Builder> {
        
        @BindsInstance
        fun inputData(inputData: InputData): Builder
    }

}