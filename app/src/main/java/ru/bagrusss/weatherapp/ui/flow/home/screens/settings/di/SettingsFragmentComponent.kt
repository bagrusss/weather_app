package ru.bagrusss.weatherapp.ui.flow.home.screens.settings.di

import dagger.Subcomponent
import ru.bagrusss.arch.rx_mvi.di.FragmentComponent
import ru.bagrusss.arch.rx_mvi.di.FragmentScope
import ru.bagrusss.weatherapp.ui.flow.home.screens.settings.SettingsContract

@FragmentScope
@Subcomponent(
    modules = [
        SettingsModule::class
    ]
)
interface SettingsFragmentComponent : FragmentComponent {

    val viewModel: SettingsContract.ViewModel

    @Subcomponent.Builder
    interface Builder : FragmentComponent.Builder<SettingsFragmentComponent, Builder> {
    }

}