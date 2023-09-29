package com.mashaktifoodfsm.features.survey.api

import com.mashaktifoodfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.mashaktifoodfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}