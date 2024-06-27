package com.example.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.api.ApiResponse
import com.example.myapplication.api.WeatherRepository
import com.example.myapplication.model.CurrentWeatherModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val weatherRepository: WeatherRepository) :
    ViewModel() {

    fun getCurrentWeather( query : String){
        viewModelScope.launch(Dispatchers.IO) {
            weatherRepository.getCurrentWeather(query)
        }
    }

    val currentWeather : LiveData<ApiResponse<CurrentWeatherModel>>
        get() {
            return weatherRepository.currentWeather
        }
}