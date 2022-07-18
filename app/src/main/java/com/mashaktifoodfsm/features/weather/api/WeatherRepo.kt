package com.mashaktifoodfsm.features.weather.api

import com.mashaktifoodfsm.base.BaseResponse
import com.mashaktifoodfsm.features.task.api.TaskApi
import com.mashaktifoodfsm.features.task.model.AddTaskInputModel
import com.mashaktifoodfsm.features.weather.model.ForeCastAPIResponse
import com.mashaktifoodfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}