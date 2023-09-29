package com.mashaktifoodfsm.features.location.api

import com.mashaktifoodfsm.features.location.shopdurationapi.ShopDurationApi
import com.mashaktifoodfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}