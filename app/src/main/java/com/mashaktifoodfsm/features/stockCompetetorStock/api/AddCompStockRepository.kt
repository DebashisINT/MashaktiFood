package com.mashaktifoodfsm.features.stockCompetetorStock.api

import com.mashaktifoodfsm.base.BaseResponse
import com.mashaktifoodfsm.features.orderList.model.NewOrderListResponseModel
import com.mashaktifoodfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.mashaktifoodfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}