package com.example.weekend_hw_2.viewModel

import androidx.lifecycle.ViewModel
import com.example.weekend_hw_2.model.Jobs
import com.example.weekend_hw_2.model.JobsItem

class TopViewModel:ViewModel() {
    var jobs = Jobs()
    init {
        jobs.jobs.add(JobsItem("a","a","a","a","a","a","a","a","a","a","a"))
        jobs.jobs.add(JobsItem("a","a","a","a","a","a","a","a","a","a","a"))
        jobs.jobs.add(JobsItem("a","a","a","a","a","a","a","a","a","a","a"))
        jobs.jobs.add(JobsItem("a","a","a","a","a","a","a","a","a","a","a"))
        jobs.jobs.add(JobsItem("a","a","a","a","a","a","a","a","a","a","a"))

    }

}