package ru.bagrusss.weatherapp.ui.flow.home.screens.map.di

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
import ru.bagrusss.weatherapp.ui.flow.home.screens.map.MapContract.*
import ru.bagrusss.weatherapp.ui.flow.home.screens.map.MapStateMapper
import ru.bagrusss.weatherapp.ui.flow.home.screens.map.MapViewModel
import javax.inject.Inject
import javax.inject.Provider

@Module
internal abstract class MapModule : BaseFragmentModule {

    @Binds
    @FragmentScope
    abstract fun bindViewModeFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @FragmentScope
    abstract fun bindStateMapper(stateMapper: MapStateMapper): MviStateMapper<DomainState, UIState>
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
        fun provideViewModel(viewModelProvider: ViewModelProvider): ViewModel = viewModelProvider[MapViewModel::class.java]

    }

}

internal class ViewModelFactory @Inject constructor(
    provider: Provider<MapViewModel>
) : DiViewModelFactory<MapViewModel>(provider)
