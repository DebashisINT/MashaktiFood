package com.mashaktifoodfsm.features.dashboard.presentation.api.dayStartEnd

import com.mashaktifoodfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.mashaktifoodfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}