package ru.bagrusss.weatherapp.ui.flow.home.screens.detailed_weather

import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.arch.rx_mvi.common.ScreenStates
import ru.bagrusss.arch.rx_mvi.MviViewModel
import kotlinx.parcelize.Parcelize

interface DetailedWeatherContract {

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