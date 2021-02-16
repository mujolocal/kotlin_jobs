package com.example.weekend_hw_2.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weekend_hw_2.R
import com.example.weekend_hw_2.adapters.TopFragmentAdapter
import com.example.weekend_hw_2.databinding.FragmentBottomBinding
import com.example.weekend_hw_2.databinding.FragmentTopBinding
import com.example.weekend_hw_2.viewModel.TopViewModel

class TopFragment : Fragment() {
    lateinit var binding: FragmentTopBinding
    lateinit var topViewModel: TopViewModel
    var jobs = ArrayList<String>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentTopBinding>(inflater,
        R.layout.fragment_top, container, false)
        topViewModel = TopViewModel()
            jobs = topViewModel.jobs
        val topFragmentAdapter = TopFragmentAdapter(jobs)
        val linearLayoutManager = LinearLayoutManager(binding.root.context)
        var recyclerView = binding.resultsRecycleView
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = topFragmentAdapter
        return binding.root


    }
}