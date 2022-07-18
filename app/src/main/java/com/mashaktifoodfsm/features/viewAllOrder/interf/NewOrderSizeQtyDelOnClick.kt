package com.mashaktifoodfsm.features.viewAllOrder.interf

import com.mashaktifoodfsm.app.domain.NewOrderGenderEntity
import com.mashaktifoodfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}