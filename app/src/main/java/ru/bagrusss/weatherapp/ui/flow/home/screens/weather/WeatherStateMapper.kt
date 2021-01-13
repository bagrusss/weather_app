package ru.bagrusss.weatherapp.ui.flow.home.screens.weather

import ru.bagrusss.arch.rx_mvi.MviStateMapper
import ru.bagrusss.weatherapp.ui.flow.home.screens.weather.WeatherContract.*
import javax.inject.Inject

internal class WeatherStateMapper @Inject constructor(

): MviStateMapper<DomainState, UIState> {

    override fun mapState(domainState: DomainState): UIState = UIState()

}