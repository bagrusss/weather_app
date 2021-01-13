package ru.bagrusss.weatherapp.ui.flow.home.screens.weather

import io.reactivex.rxjava3.core.Observable
import ru.bagrusss.arch.common.SchedulersProvider
import ru.bagrusss.arch.rx_mvi.BaseViewModel
import ru.bagrusss.arch.rx_mvi.MviStateMapper
import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.weatherapp.ui.flow.home.screens.weather.WeatherContract.*

import javax.inject.Inject


internal class WeatherViewModel @Inject constructor(
    stateMapper: MviStateMapper<DomainState, UIState>,
    schedulersProvider: SchedulersProvider
    
) : BaseViewModel<DomainState, UIState, IOData.EmptyOutput>(stateMapper, schedulersProvider), ViewModel {

    override fun observeDomainState(): Observable<DomainState> = Observable.just(DomainState())

}