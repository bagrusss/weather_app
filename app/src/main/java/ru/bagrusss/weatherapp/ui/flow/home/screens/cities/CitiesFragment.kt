package ru.bagrusss.weatherapp.ui.flow.home.screens.cities

import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.weatherapp.ui.flow.home.screens.cities.CitiesContract.UIState
import ru.bagrusss.arch.common.unsafeLazy
import ru.bagrusss.arch.rx_mvi.MviFragment

class CitiesFragment : MviFragment<UIState, IOData.EmptyInput, IOData.EmptyOutput>() {

    override val viewModel by unsafeLazy { component.viewModel }

    override val component by unsafeLazy {
        DiProvider.component
                    .citiesComponentBuilder
                    .fragment(this)
                    .build()
    }

    override fun buildScreen(state: UIState) {

    }

}