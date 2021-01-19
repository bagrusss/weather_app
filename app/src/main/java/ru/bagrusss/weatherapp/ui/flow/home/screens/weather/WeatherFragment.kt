package ru.bagrusss.weatherapp.ui.flow.home.screens.weather

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import ru.bagrusss.arch.common.unsafeLazy
import ru.bagrusss.arch.rx_mvi.MviFragment
import ru.bagrusss.arch.rx_mvi.common.IOData
import ru.bagrusss.weatherapp.R
import ru.bagrusss.weatherapp.di.AppProvider
import ru.bagrusss.weatherapp.ui.flow.home.screens.weather.WeatherContract.UIState

class WeatherFragment : MviFragment<UIState, IOData.EmptyInput, IOData.EmptyOutput>(R.layout.fragment_weather) {

    override val viewModel by unsafeLazy { component.viewModel }

    override val component by unsafeLazy {
        AppProvider.api
            .weatherComponentBuilder
            .fragment(this)
            .build()
    }

    private lateinit var toolbar: Toolbar

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.run {
            toolbar = findViewById(R.id.toolbar)

            supportActivity.setSupportActionBar(toolbar)
        }
    }

    override fun buildScreen(state: UIState) {

    }

}