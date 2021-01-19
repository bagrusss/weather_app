package ru.bagrusss.weatherapp.ui.flow.home.screens.map

import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.weatherapp.ui.flow.home.screens.map.MapContract.InputData
import ru.bagrusss.weatherapp.ui.flow.home.screens.map.MapContract.UIState
import ru.bagrusss.arch.common.unsafeLazy
import ru.bagrusss.arch.rx_mvi.MviFragment
import ru.bagrusss.weatherapp.R

class MapFragment : MviFragment<UIState, InputData, IOData.EmptyOutput>(R.layout.fragment_map) {

    override val viewModel by unsafeLazy { component.viewModel }

    override val component by unsafeLazy {
        DiProvider.component
                    .mapComponentBuilder
                    .inputData(inputData)
                    .fragment(this)
                    .build()
    }

    override fun buildScreen(state: UIState) {

    }

}