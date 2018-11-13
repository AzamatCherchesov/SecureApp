package com.a1tt.appsecurity

import android.support.v4.app.Fragment

class TargetAppListActivity : SingleFragmentActivity() {
    override fun createFragment(): Fragment {
        return TargetAppListFragment()
    }

}