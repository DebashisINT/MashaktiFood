package com.mashaktifoodfsm.features.login.model.productlistmodel

import com.mashaktifoodfsm.app.domain.ModelEntity
import com.mashaktifoodfsm.app.domain.ProductListEntity
import com.mashaktifoodfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}