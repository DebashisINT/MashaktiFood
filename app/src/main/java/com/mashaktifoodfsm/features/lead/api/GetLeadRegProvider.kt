package com.mashaktifoodfsm.features.lead.api

import com.mashaktifoodfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.mashaktifoodfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}