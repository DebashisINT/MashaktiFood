package com.mashaktifoodfsm.features.task.api

import com.mashaktifoodfsm.features.timesheet.api.TimeSheetApi
import com.mashaktifoodfsm.features.timesheet.api.TimeSheetRepo

/**
 * Created by Saikat on 12-Aug-20.
 */
object TaskRepoProvider {
    fun taskRepoProvider(): TaskRepo {
        return TaskRepo(TaskApi.create())
    }
}