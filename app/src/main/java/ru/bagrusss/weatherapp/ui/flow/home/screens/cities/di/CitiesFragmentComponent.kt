package ru.bagrusss.weatherapp.ui.flow.home.screens.cities.di

import dagger.Subcomponent
import ru.bagrusss.arch.rx_mvi.di.FragmentComponent
import ru.bagrusss.arch.rx_mvi.di.FragmentScope
import ru.bagrusss.weatherapp.ui.flow.home.screens.cities.CitiesContract

@FragmentScope
@Subcomponent(
    modules = [
        CitiesModule::class
    ]
)
interface CitiesFragmentComponent : FragmentComponent {

    val viewModel: CitiesContract.ViewModel

    @Subcomponent.Builder
    interface Builder : FragmentComponent.Builder<CitiesFragmentComponent, Builder> {
    }

}