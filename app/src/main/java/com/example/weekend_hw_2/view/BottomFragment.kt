package com.example.weekend_hw_2.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.weekend_hw_2.R
import com.example.weekend_hw_2.databinding.FragmentBottomBinding

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
}