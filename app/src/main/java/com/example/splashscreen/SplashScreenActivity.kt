package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
        }, SPLASH_TIME_OUT)

    }

    override fun onPause() {
        super.onPause()
        finish()
    }

    companion object {
        //set time out for 2 seconds
        private const val SPLASH_TIME_OUT: Long = 2000
    }
}
