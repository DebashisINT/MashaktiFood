package com.mashaktifoodfsm.features.viewAllOrder.interf

import com.mashaktifoodfsm.app.domain.NewOrderProductEntity
import com.mashaktifoodfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}