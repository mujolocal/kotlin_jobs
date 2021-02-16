package com.example.weekend_hw_2.viewModel

import android.content.Intent
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weekend_hw_2.model.Jobs
import com.example.weekend_hw_2.model.JobsItem
import com.example.weekend_hw_2.repo.JobRepo
import com.example.weekend_hw_2.view.MainActivity
import com.example.weekend_hw_2.view.SplashActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SplashViewModel:ViewModel() {
    private val TAG = "SplashViewModel"

    private val _jobs = MutableLiveData<MutableList<JobsItem>>()

    val jobs: LiveData<MutableList<JobsItem>>
        get() = _jobs

    init {
        val callBack: Callback<MutableList<JobsItem>> = object : Callback<MutableList<JobsItem>> {
            override fun onResponse(call: Call<MutableList<JobsItem>>, response: Response<MutableList<JobsItem>>) {
                Log.d(TAG, "onResponse: completed")
                _jobs.value = response.body()
            }

            override fun onFailure(call: Call<MutableList<JobsItem>>, t: Throwable) {
                Log.e(TAG, "onFailure: ", t)
            }


        }
    }

    fun getJobs() {
        viewModelScope.launch(Dispatchers.IO) {
            val jobList = JobRepo.getJobs("api")
            _jobs.postValue(jobList)
        }
    }

}

