package com.mashaktifoodfsm.features.viewAllOrder.orderOptimized

import com.mashaktifoodfsm.app.domain.ProductOnlineRateTempEntity
import com.mashaktifoodfsm.base.BaseResponse
import com.mashaktifoodfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}