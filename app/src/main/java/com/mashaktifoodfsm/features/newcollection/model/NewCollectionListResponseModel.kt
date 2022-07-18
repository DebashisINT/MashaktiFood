package com.mashaktifoodfsm.features.newcollection.model

import com.mashaktifoodfsm.app.domain.CollectionDetailsEntity
import com.mashaktifoodfsm.base.BaseResponse
import com.mashaktifoodfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}