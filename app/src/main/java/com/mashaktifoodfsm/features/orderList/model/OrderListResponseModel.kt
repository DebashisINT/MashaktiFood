package com.mashaktifoodfsm.features.orderList.model

import com.mashaktifoodfsm.base.BaseResponse

/**
 * Created by Saikat on 01-10-2018.
 */
class OrderListResponseModel : BaseResponse() {
    var order_list: List<OrderListDataModel>? = null
}