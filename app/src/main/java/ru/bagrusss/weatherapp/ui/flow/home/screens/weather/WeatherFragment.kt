package ru.bagrusss.weatherapp.ui.flow.home.screens.weather

import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.weatherapp.ui.flow.home.screens.weather.WeatherContract.UIState
import ru.bagrusss.arch.common.unsafeLazy
import ru.bagrusss.arch.rx_mvi.MviFragment
import ru.bagrusss.weatherapp.R

class WeatherFragment : MviFragment<UIState, IOData.EmptyInput, IOData.EmptyOutput>(R.layout.fragment_weather) {

    override val viewModel by unsafeLazy { component.viewModel }

    override val component by unsafeLazy {
        DiProvider.component
                    .weatherComponentBuilder
                    .fragment(this)
                    .build()
    }

    override fun buildScreen(state: UIState) {

    }

}