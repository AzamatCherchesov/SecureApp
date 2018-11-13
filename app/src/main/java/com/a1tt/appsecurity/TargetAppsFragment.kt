package com.a1tt.appsecurity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.a1tt.appsecurity.consts.LOG_TAG

class TargetAppsFragment : Fragment() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        println(LOG_TAG + "TargetAppsFragment onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.target_app_fragment, container, false)
        if (root == null) println(LOG_TAG + "root is null")
        else println(LOG_TAG + "root is not null")
        return root
    }
}