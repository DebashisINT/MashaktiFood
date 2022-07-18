package com.mashaktifoodfsm.features.login.model

import com.mashaktifoodfsm.base.BaseResponse

class ShopFeedbackResponseModel :BaseResponse(){
        var shop_list:List<Shop_list>? = null
}

data class Shop_list(var shop_id:String,var feedback_remark_list:List<Feedback_remark>)

data class Feedback_remark(var feedback:String,var date_time:String)