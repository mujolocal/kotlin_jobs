package com.example.weekend_hw_2.view

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.weekend_hw_2.R
import com.example.weekend_hw_2.databinding.FragmentBottomBinding
import com.example.weekend_hw_2.model.JobsItem

class BottomFragment : Fragment() {
    lateinit var binding: FragmentBottomBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentBottomBinding>(
            inflater, R.layout.fragment_bottom, container, false
        )
        return binding.root
    }
    fun setJob(jobsItem: JobsItem){
        binding.name.text = jobsItem.company
        binding.title.text = jobsItem.title
        binding.url.text = jobsItem.url
        binding.location.text = jobsItem.location
        binding.jobDescription.text = Html.fromHtml( jobsItem.description)
        Glide.with(this).load(jobsItem.company_logo).into(binding.logo);

    }


}