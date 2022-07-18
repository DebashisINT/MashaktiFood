package com.mashaktifoodfsm.features.orderList.model

import com.mashaktifoodfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}