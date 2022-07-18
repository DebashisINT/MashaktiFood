package com.mashaktifoodfsm.features.viewAllOrder.interf

import com.mashaktifoodfsm.app.domain.NewOrderColorEntity
import com.mashaktifoodfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}