package com.kestrel9.android.boostcamp.util

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity

/**
 * BoostCamp
 * Class: AppCompatActivityExt
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */

fun AppCompatActivity.replaceFragmentInActivity(fragment: Fragment, @IdRes frameIdRes: Int) {
    supportFragmentManager.transact {
        replace(frameIdRes, fragment)
    }
}

/**
 * Runs a FragmentTransaction, then calls commit().
 */
private inline fun FragmentManager.transact(action: FragmentTransaction.() -> Unit) {
    beginTransaction().apply {
        action()
    }.commit()
}