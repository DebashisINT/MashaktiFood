package com.mashaktifoodfsm.features.location.shopRevisitStatus

import com.mashaktifoodfsm.features.location.shopdurationapi.ShopDurationApi
import com.mashaktifoodfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}