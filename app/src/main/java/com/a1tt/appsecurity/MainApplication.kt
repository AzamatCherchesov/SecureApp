package com.a1tt.appsecurity

import android.app.Application
import android.os.CountDownTimer

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: MainApplication
            private set
        var countDownTimer: CountDownTimer? = null
        var timerCounter: Long = 1000
    }
}