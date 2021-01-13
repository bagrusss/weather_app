package ru.bagrusss.weatherapp.ui.flow.home.screens.settings.di

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.bagrusss.arch.rx_mvi.MviStateMapper
import ru.bagrusss.arch.rx_mvi.di.BaseFragmentModule
import ru.bagrusss.arch.rx_mvi.di.DiViewModelFactory
import ru.bagrusss.arch.rx_mvi.di.FragmentQualifier
import ru.bagrusss.arch.rx_mvi.di.FragmentScope
import ru.bagrusss.weatherapp.ui.flow.home.screens.settings.SettingsContract.*
import ru.bagrusss.weatherapp.ui.flow.home.screens.settings.SettingsStateMapper
import ru.bagrusss.weatherapp.ui.flow.home.screens.settings.SettingsViewModel
import javax.inject.Inject
import javax.inject.Provider

@Module
internal abstract class SettingsModule : BaseFragmentModule {

    @Binds
    @FragmentScope
    abstract fun bindViewModeFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @FragmentScope
    abstract fun bindStateMapper(stateMapper: SettingsStateMapper): MviStateMapper<DomainState, UIState>
    @Module
    companion object {

        @Provides
        @JvmStatic
        @FragmentScope
        fun provideViewModelProvider(
            @FragmentQualifier storeOwner: ViewModelStoreOwner,
            factory: ViewModelProvider.Factory
        ) = ViewModelProvider(storeOwner, factory)

        @Provides
        @JvmStatic
        @FragmentScope
        fun provideViewModel(viewModelProvider: ViewModelProvider): ViewModel = viewModelProvider[SettingsViewModel::class.java]

    }

}

internal class ViewModelFactory @Inject constructor(
    provider: Provider<SettingsViewModel>
) : DiViewModelFactory<SettingsViewModel>(provider)
