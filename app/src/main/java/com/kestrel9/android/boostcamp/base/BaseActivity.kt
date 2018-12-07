package com.kestrel9.android.boostcamp.base

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

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