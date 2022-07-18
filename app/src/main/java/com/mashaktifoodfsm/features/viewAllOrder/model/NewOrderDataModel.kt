package com.mashaktifoodfsm.features.viewAllOrder.model

import com.mashaktifoodfsm.app.domain.NewOrderColorEntity
import com.mashaktifoodfsm.app.domain.NewOrderGenderEntity
import com.mashaktifoodfsm.app.domain.NewOrderProductEntity
import com.mashaktifoodfsm.app.domain.NewOrderSizeEntity
import com.mashaktifoodfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

