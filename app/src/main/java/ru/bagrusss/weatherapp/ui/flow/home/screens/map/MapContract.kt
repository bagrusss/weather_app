package ru.bagrusss.weatherapp.ui.flow.home.screens.map

import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.arch.rx_mvi.common.ScreenStates
import ru.bagrusss.arch.rx_mvi.MviViewModel
import kotlinx.parcelize.Parcelize

interface MapContract {

    interface ViewModel : MviViewModel<UIState, IOData.EmptyOutput>
    
    @Parcelize
    data class InputData(
        val value: Int
    ) : IOData.Input

    data class DomainState(
        val value: Int = 0
    ) : ScreenStates.Domain

    data class UIState(
        val value: Int = 0
    ) : ScreenStates.UI

}