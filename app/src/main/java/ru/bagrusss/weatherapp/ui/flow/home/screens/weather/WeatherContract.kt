package ru.bagrusss.weatherapp.ui.flow.home.screens.weather

import ru.bagrusss.arch.rx_mvi.MviViewModel
import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.arch.rx_mvi.common.ScreenStates
import ru.bagrusss.weatherapp.domain.models.DayWeather

interface WeatherContract {

    interface ViewModel : MviViewModel<UIState, IOData.EmptyOutput>

    data class DomainState(
        val value: Int = 0
    ) : ScreenStates.Domain

    data class UIState(
        @JvmField val temp: String = "",//TODO
        @JvmField val tempDescription: String = "",
        @JvmField val imageUrl: String = "",
        @JvmField val items: List<DayWeather> = listOf()
    ) : ScreenStates.UI

}