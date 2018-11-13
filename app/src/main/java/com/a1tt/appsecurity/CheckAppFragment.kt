package com.a1tt.appsecurity

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment

class CheckAppFragment() : DialogFragment() {

    lateinit var appName: String

    fun setName(appName:String): CheckAppFragment {
        this.appName = appName
        return this
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(activity).setTitle("оправка приложения на анализ")
                .setMessage("Отправить приложение \"$appName\" на анализ?")
                .setPositiveButton("отправить", null)
                .setNegativeButton("отмена", null)
                .create()
    }
}