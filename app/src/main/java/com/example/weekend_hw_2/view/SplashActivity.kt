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

class SplashActivity: AppCompatActivity() {

    private val TAG = "SplashActivity"
    val splashViewModel: SplashViewModel = SplashViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivitySplashBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_splash
        )
        splashViewModel.jobs.observe(this) {
            Log.d(TAG, "onCreate: " + it)
        }
        splashViewModel.getJobs(10)
        val title = binding.introTitle
        val animation = AlphaAnimation(0f, 1f)
        animation.fillAfter = true
        animation.duration = 3000
        animation.hasEnded()
        title.startAnimation(animation)
        val intent: Intent = Intent(this, MainActivity::class.java)




    }
}