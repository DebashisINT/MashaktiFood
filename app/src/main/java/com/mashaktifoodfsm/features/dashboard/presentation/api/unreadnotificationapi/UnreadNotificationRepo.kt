package com.mashaktifoodfsm.features.dashboard.presentation.api.unreadnotificationapi

import com.mashaktifoodfsm.app.Pref
import com.mashaktifoodfsm.features.dashboard.presentation.model.UnreadNotificationResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 07-03-2019.
 */
class UnreadNotificationRepo(val apiService: UnreadNotificationApi) {
    fun unreadNotification(): Observable<UnreadNotificationResponseModel> {
        return apiService.unreadNotification(Pref.session_token!!, Pref.user_id!!)
    }
}