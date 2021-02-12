package com.example.weekend_hw_2

import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.weekend_hw_2.databinding.ActivitySplashBinding

class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivitySplashBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        val title = binding.introTitle
        val animation = AlphaAnimation(0f, 1f)
            animation.fillAfter = true
            animation.duration = 3000
            title.startAnimation(animation)
        val intent: Intent = Intent(this, MainActivity::class.java)


    //startActivity(intent)

    }
}