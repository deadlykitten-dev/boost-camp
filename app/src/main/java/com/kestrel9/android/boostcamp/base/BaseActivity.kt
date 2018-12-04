package com.kestrel9.android.boostcamp.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity

/**
 * BoostCamp
 * Class: BaseActivitiy
 * Created by kestr on 2018-12-03.
 *
 * Description:
 */
abstract class BaseActivity<B : ViewDataBinding>(@LayoutRes private val layoutRes: Int) : AppCompatActivity() {

    protected lateinit var binding: B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutRes)
        binding.setLifecycleOwner(this)
    }
}