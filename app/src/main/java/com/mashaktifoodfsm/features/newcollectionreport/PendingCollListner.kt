package com.mashaktifoodfsm.features.newcollectionreport

import com.mashaktifoodfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}