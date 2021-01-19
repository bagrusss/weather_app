package ru.bagrusss.weatherapp.ui.flow.home.screens.detailed_weather

import ru.bagrusss.arch.common.unsafeLazy
import ru.bagrusss.arch.rx_mvi.MviFragment
import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.weatherapp.R
import ru.bagrusss.weatherapp.di.AppProvider
import ru.bagrusss.weatherapp.ui.flow.home.screens.detailed_weather.DetailedWeatherContract.InputData
import ru.bagrusss.weatherapp.ui.flow.home.screens.detailed_weather.DetailedWeatherContract.UIState

class DetailedWeatherFragment : MviFragment<UIState, InputData, IOData.EmptyOutput>(R.layout.fragment_detailed_weather) {

    override val viewModel by unsafeLazy { component.viewModel }

    override val component by unsafeLazy {
        AppProvider.api
            .detailedWeatherComponentBuilder
            .inputData(inputData)
            .fragment(this)
            .build()
    }

    override fun buildScreen(state: UIState) {

    }

}