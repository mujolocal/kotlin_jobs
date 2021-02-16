package com.example.weekend_hw_2.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.animation.AlphaAnimation
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.weekend_hw_2.R
import com.example.weekend_hw_2.databinding.ActivitySplashBinding
import com.example.weekend_hw_2.viewModel.SplashViewModel
import com.google.android.material.textview.MaterialTextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*

class SplashActivity: AppCompatActivity() {

    private val TAG = "SplashActivity"
    private var requestFlag = false
    val splashViewModel: SplashViewModel = SplashViewModel()
    lateinit var title : MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent: Intent = Intent(this, MainActivity::class.java)
        val binding: ActivitySplashBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_splash
        )
        splashViewModel.jobs.observe(this) {
            Log.d(TAG, "onCreate: " )
            requestFlag = true
            Log.d(TAG, "onCreate: reqest flag is "+requestFlag)
            startActivity(intent)
        }
        splashViewModel.getJobs()
        title = binding.introTitle
        val animation = AlphaAnimation(0f, 1f)
            animation.fillAfter = true
            animation.duration = 3000
            title.startAnimation(animation)
        Log.d(TAG, "onCreate: title animate "+title.animation.hasEnded())




    }

}