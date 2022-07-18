package com.mashaktifoodfsm.features.viewAllOrder.interf

import com.mashaktifoodfsm.app.domain.NewOrderGenderEntity
import com.mashaktifoodfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}