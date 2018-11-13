package com.a1tt.appsecurity

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.a1tt.appsecurity.MainApplication.Companion.countDownTimer
import com.a1tt.appsecurity.MainApplication.Companion.timerCounter
import com.a1tt.appsecurity.consts.LOG_TAG

class SplashScreenActivity : AppCompatActivity() {

    private var myApplication : MainApplication? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.d(LOG_TAG, "onPostResume")

        if (countDownTimer != null) {
            countDownTimer!!.cancel()
        }
        countDownTimer = object : CountDownTimer(timerCounter, 10) {
            override fun onTick(millisUntilFinished: Long) {
                timerCounter = millisUntilFinished
            }

            override fun onFinish() {
                onTimer()
            }
        }.start()
    }

    fun onTimer() {
        val intent = Intent(this, TargetAppListActivity::class.java)
        startActivity(intent)
        finish()
    }
}