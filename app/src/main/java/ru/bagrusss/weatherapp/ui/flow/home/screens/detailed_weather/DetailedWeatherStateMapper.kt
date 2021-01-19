package ru.bagrusss.weatherapp.ui.flow.home.screens.detailed_weather

import ru.bagrusss.arch.rx_mvi.MviStateMapper
import ru.bagrusss.weatherapp.ui.flow.home.screens.detailed_weather.DetailedWeatherContract.*
import javax.inject.Inject

internal class DetailedWeatherStateMapper @Inject constructor(

): MviStateMapper<DomainState, UIState> {

    override fun mapState(domainState: DomainState): UIState = UIState()

}