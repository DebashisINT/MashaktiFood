package com.mashaktifoodfsm.features.document.api

import com.mashaktifoodfsm.features.dymanicSection.api.DynamicApi
import com.mashaktifoodfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}