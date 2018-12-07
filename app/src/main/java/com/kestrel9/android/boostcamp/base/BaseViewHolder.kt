package com.kestrel9.android.boostcamp.base

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.lang.Exception

/**
 * BoostCamp
 * Class: BaseViewHolder
 * Created by kestr on 2018-12-05.
 *
 * Description:
 */
abstract class BaseViewHolder<B : ViewDataBinding>(
    @LayoutRes layoutRes: Int,
    parent: ViewGroup?,
    private val bindingVariableId: Int?
) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent?.context)
        .inflate(layoutRes, parent, false)
) {
    val binding: B = DataBindingUtil.bind(itemView)!!

    fun onBindViewHolder(item: Any?) {
        try {
            bindingVariableId?.let { binding.setVariable(it, item) }
            itemView.visibility = View.VISIBLE
        } catch (e: Exception) {
            e.printStackTrace()
            itemView.visibility = View.GONE
        }
    }
}