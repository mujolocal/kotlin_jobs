package com.example.weekend_hw_2.adapters

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.weekend_hw_2.R
import com.example.weekend_hw_2.model.Jobs
import com.example.weekend_hw_2.model.JobsItem
import com.example.weekend_hw_2.view.TopFragment
import com.google.android.material.textview.MaterialTextView

class TopFragmentAdapter(var jobs: Jobs,var topFragment: TopFragment ): RecyclerView.Adapter<TopFragmentAdapter.JobViewHolder>(){
    private val _clickedJob = MutableLiveData<JobsItem>()
    val clickedJob:LiveData<JobsItem>
        get() = _clickedJob

    class JobViewHolder(view: View): RecyclerView.ViewHolder(view){
        val jobName: MaterialTextView
        val jobTitle: MaterialTextView
        val jobLocation: MaterialTextView
        val jobLogo: ImageView

        init {
            jobName = view.findViewById(R.id.job_name)
            jobTitle = view.findViewById(R.id.job_title)
            jobLocation = view.findViewById(R.id.job_location)
            jobLogo = view.findViewById(R.id.job_logo)

        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.top_rv_item,
            parent,
            false
        )
        return JobViewHolder(view)
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        holder.jobName.text = jobs.jobs[position].company
        holder.jobTitle.text = jobs.jobs[position].title
        holder.jobLocation.text = jobs.jobs[position].location
        Glide.with(topFragment).load(jobs.jobs[position].company_logo).into(holder.jobLogo);

        holder.itemView.setOnClickListener {
            _clickedJob.value = jobs.jobs[position]
        }
    }

    override fun getItemCount(): Int {
        return jobs.jobs.size
    }
}