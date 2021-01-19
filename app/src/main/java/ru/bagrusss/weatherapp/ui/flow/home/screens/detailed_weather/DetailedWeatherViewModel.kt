package ru.bagrusss.weatherapp.ui.flow.home.screens.detailed_weather

import io.reactivex.rxjava3.core.Observable
import ru.bagrusss.arch.common.SchedulersProvider
import ru.bagrusss.arch.rx_mvi.BaseViewModel
import ru.bagrusss.arch.rx_mvi.MviStateMapper
import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.weatherapp.ui.flow.home.screens.detailed_weather.DetailedWeatherContract.*

import javax.inject.Inject


internal class DetailedWeatherViewModel @Inject constructor(
    stateMapper: MviStateMapper<DomainState, UIState>,
    schedulersProvider: SchedulersProvider
    ,
    private val inputData: InputData
) : BaseViewModel<DomainState, UIState, IOData.EmptyOutput>(stateMapper, schedulersProvider), ViewModel {

    override fun observeDomainState(): Observable<DomainState> = Observable.just(DomainState())

}