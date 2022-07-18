package com.mashaktifoodfsm.features.viewAllOrder.interf

import com.mashaktifoodfsm.app.domain.NewOrderGenderEntity
import com.mashaktifoodfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}