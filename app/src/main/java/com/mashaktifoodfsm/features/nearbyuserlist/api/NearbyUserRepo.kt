package com.mashaktifoodfsm.features.nearbyuserlist.api

import com.mashaktifoodfsm.app.Pref
import com.mashaktifoodfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.mashaktifoodfsm.features.newcollection.model.NewCollectionListResponseModel
import com.mashaktifoodfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}