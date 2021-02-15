package com.example.weekend_hw_2.repo.remote

import com.example.weekend_hw_2.model.JobsItem
import retrofit2.http.GET
import retrofit2.http.Query

interface JobService {
    @GET("positions.json/")
    suspend fun getJobCoroutines(
        @Query("description") description: String
    ): List<JobsItem>
}