package ru.bagrusss.weatherapp.ui.flow.home.screens.settings

import ru.bagrusss.arch.rx_mvi.MviStateMapper
import ru.bagrusss.weatherapp.ui.flow.home.screens.settings.SettingsContract.*
import javax.inject.Inject

internal class SettingsStateMapper @Inject constructor(

): MviStateMapper<DomainState, UIState> {

    override fun mapState(domainState: DomainState): UIState = UIState()

}