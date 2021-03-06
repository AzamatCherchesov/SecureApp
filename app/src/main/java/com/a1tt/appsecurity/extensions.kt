package com.a1tt.appsecurity

import android.app.Activity
import android.content.Context
import android.content.Intent

inline fun <reified T: Activity> Context.createIntent() = Intent(this, T::class.java)