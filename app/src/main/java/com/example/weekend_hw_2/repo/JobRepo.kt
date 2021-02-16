package com.example.weekend_hw_2.repo


import com.example.weekend_hw_2.model.JobsItem
import com.example.weekend_hw_2.repo.remote.RetrofitInstance


object JobRepo {

    val jobService = RetrofitInstance.jobService


    suspend fun getJobs(type: String) : MutableList<JobsItem> {
        return RetrofitInstance.jobService.getJobCoroutines(type)
    }
}