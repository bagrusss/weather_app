package ru.bagrusss.weatherapp.ui.flow.home.screens.cities

import ru.bagrusss.arch.rx_mvi.MviStateMapper
import ru.bagrusss.weatherapp.ui.flow.home.screens.cities.CitiesContract.*
import javax.inject.Inject

internal class CitiesStateMapper @Inject constructor(

): MviStateMapper<DomainState, UIState> {

    override fun mapState(domainState: DomainState): UIState = UIState()

}