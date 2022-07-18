package com.mashaktifoodfsm.features.stockAddCurrentStock.api

import com.mashaktifoodfsm.base.BaseResponse
import com.mashaktifoodfsm.features.location.model.ShopRevisitStatusRequest
import com.mashaktifoodfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.mashaktifoodfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.mashaktifoodfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.mashaktifoodfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}