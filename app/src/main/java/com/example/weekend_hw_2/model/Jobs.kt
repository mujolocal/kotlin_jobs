package com.example.weekend_hw_2.model

import java.io.Serializable

data class Jobs (


    var jobs: MutableList<JobsItem> = mutableListOf()
): Serializable{

    override fun toString(): String {
        var jobsString = ""

        for (job in jobs) {
        jobsString += job.company+" "
        }
        return jobsString
    }
}