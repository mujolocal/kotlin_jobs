package com.example.weekend_hw_2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weekend_hw_2.R
import com.example.weekend_hw_2.adapters.TopFragmentAdapter
import com.example.weekend_hw_2.databinding.ActivityMainBinding
import com.example.weekend_hw_2.databinding.FragmentTopBindingImpl
import com.example.weekend_hw_2.model.Jobs
import com.example.weekend_hw_2.model.JobsItem

class MainActivity : AppCompatActivity() {


    private val TAG = "MainActivity"
    lateinit var binding: ActivityMainBinding
    private val JOBS_KEY = "jobs_key"
    lateinit var jobs: Jobs
    lateinit var topFragment: TopFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )
        topFragmentUpdate()

    }
    fun topFragmentUpdate(){
        jobs = intent.extras?.getSerializable(JOBS_KEY) as Jobs
        topFragment = supportFragmentManager.findFragmentById(R.id.top_fragment) as TopFragment
        val topFragmentAdapter = TopFragmentAdapter(jobs)
        topFragment.recyclerView.adapter = topFragmentAdapter
    }

}