package com.mashaktifoodfsm.features.photoReg.present

import com.mashaktifoodfsm.app.domain.ProspectEntity
import com.mashaktifoodfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}