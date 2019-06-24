package com.divinegrace.navigationutifile

import android.app.Fragment
import android.support.annotation.IdRes
import android.support.v7.app.AppCompatActivity


fun AppCompatActivity.replaceFragment(fragment: Fragment,
                                      allowStateLoss :Boolean =false,
                                      @IdRes containerViewId: Int
)
{

    val ft =fragmentManager
        .beginTransaction()
        .replace(containerViewId,fragment)

    if
            (!supportFragmentManager.isStateSaved){
        ft.commit()

    }

}
// end of function


