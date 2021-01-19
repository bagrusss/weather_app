package ru.bagrusss.weatherapp.ui.flow.home.screens.map

import ru.bagrusss.arch.rx_mvi.MviStateMapper
import ru.bagrusss.weatherapp.ui.flow.home.screens.map.MapContract.*
import javax.inject.Inject

internal class MapStateMapper @Inject constructor(

): MviStateMapper<DomainState, UIState> {

    override fun mapState(domainState: DomainState): UIState = UIState()

}