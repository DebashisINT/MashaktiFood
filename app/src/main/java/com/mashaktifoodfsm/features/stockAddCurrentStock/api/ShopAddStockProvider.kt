package com.mashaktifoodfsm.features.stockAddCurrentStock.api

import com.mashaktifoodfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.mashaktifoodfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}