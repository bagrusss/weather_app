package ru.bagrusss.weatherapp.ui.flow.home.screens.cities

import ru.bagrusss.arch.common.unsafeLazy
import ru.bagrusss.arch.rx_mvi.MviFragment
import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.weatherapp.R
import ru.bagrusss.weatherapp.di.AppProvider
import ru.bagrusss.weatherapp.ui.flow.home.screens.cities.CitiesContract.UIState

class CitiesFragment : MviFragment<UIState, IOData.EmptyInput, IOData.EmptyOutput>(R.layout.fragment_cities) {

    override val viewModel by unsafeLazy { component.viewModel }

    override val component by unsafeLazy {
        AppProvider.api
            .citiesComponentBuilder
            .fragment(this)
            .build()
    }

    override fun buildScreen(state: UIState) {

    }

}