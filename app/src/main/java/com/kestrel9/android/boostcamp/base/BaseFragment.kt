package com.kestrel9.android.boostcamp.base

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * BoostCamp
 * Class: BaseFragment
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
abstract class BaseFragment<B : ViewDataBinding>(@LayoutRes private val layoutRes: Int) : Fragment() {
    protected lateinit var binding: B

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
        binding.setLifecycleOwner(this)
        return binding.root
    }
}