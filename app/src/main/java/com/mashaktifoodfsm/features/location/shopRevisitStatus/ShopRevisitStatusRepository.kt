package com.mashaktifoodfsm.features.location.shopRevisitStatus

import com.mashaktifoodfsm.base.BaseResponse
import com.mashaktifoodfsm.features.location.model.ShopDurationRequest
import com.mashaktifoodfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}