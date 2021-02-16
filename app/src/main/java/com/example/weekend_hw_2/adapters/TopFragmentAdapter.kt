package com.example.weekend_hw_2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weekend_hw_2.R
import com.example.weekend_hw_2.model.Jobs
import com.google.android.material.textview.MaterialTextView

class TopFragmentAdapter(var jobs: Jobs): RecyclerView.Adapter<TopFragmentAdapter.JobViewHolder>(){

    class JobViewHolder(view: View): RecyclerView.ViewHolder(view){
        val jobName: MaterialTextView
        init {
            jobName = view.findViewById(R.id.job_name)

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
    }

    override fun getItemCount(): Int {
        return jobs.jobs.size
    }
}