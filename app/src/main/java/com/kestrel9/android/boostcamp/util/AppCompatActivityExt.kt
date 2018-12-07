package com.kestrel9.android.boostcamp.util

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.appcompat.app.AppCompatActivity

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