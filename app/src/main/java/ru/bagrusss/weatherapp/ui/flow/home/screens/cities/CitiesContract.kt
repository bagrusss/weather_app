package ru.bagrusss.weatherapp.ui.flow.home.screens.cities

import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.arch.rx_mvi.common.ScreenStates
import ru.bagrusss.arch.rx_mvi.MviViewModel

interface CitiesContract {

    interface ViewModel : MviViewModel<UIState, IOData.EmptyOutput>

    data class DomainState(
        val value: Int = 0
    ) : ScreenStates.Domain

    data class UIState(
        val value: Int = 0
    ) : ScreenStates.UI

}