package com.example.weekend_hw_2.model

import java.io.Serializable

data class Jobs (


    val jobs: List<JobsItem> = listOf()
): Serializable{

    override fun toString(): String {
        var jobsString = ""

        for (job in jobs) {
        jobsString += job.company+" "
        }
        return jobsString
    }
}