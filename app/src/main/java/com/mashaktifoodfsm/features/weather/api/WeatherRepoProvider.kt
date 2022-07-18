package com.mashaktifoodfsm.features.weather.api

import com.mashaktifoodfsm.features.task.api.TaskApi
import com.mashaktifoodfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}