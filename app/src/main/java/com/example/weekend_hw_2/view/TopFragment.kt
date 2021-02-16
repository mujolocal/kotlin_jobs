package com.example.weekend_hw_2.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.weekend_hw_2.R
import com.example.weekend_hw_2.databinding.FragmentBottomBinding
import com.example.weekend_hw_2.databinding.FragmentTopBinding

class TopFragment : Fragment() {
    lateinit var binding: FragmentTopBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate<FragmentTopBinding>(inflater,
        R.layout.fragment_top, container, false)
        return binding.root
    }
}