package ru.bagrusss.weatherapp.ui.flow.home.screens.settings

import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.weatherapp.ui.flow.home.screens.settings.SettingsContract.UIState
import ru.bagrusss.arch.common.unsafeLazy
import ru.bagrusss.arch.rx_mvi.MviFragment

class SettingsFragment : MviFragment<UIState, IOData.EmptyInput, IOData.EmptyOutput>() {

    override val viewModel by unsafeLazy { component.viewModel }

    override val component by unsafeLazy {
        DiProvider.component
                    .settingsComponentBuilder
                    .fragment(this)
                    .build()
    }

    override fun buildScreen(state: UIState) {

    }

}