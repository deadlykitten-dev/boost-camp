package com.kestrel9.android.boostcamp.base

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * BoostCamp
 * Class: BaseRecyclerViewAdapter
 * Created by kestr on 2018-12-05.
 *
 * Description:
 */
abstract class BaseRecyclerViewAdapter<ITEM : Any, B : ViewDataBinding>(
    @LayoutRes private val layoutRes: Int,
    private val bindingVarianceId: Int? = null
) : RecyclerView.Adapter<BaseViewHolder<B>>() {

    private val items = mutableListOf<ITEM>()

    fun replaceAll(items: List<ITEM>?) {
        items?.let {
            this.items.run {
                clear()
                addAll(it)
            }
        }
    }

    fun add(item: ITEM?) {
        item?.let {
            items.add(it)
        }
    }

    fun clear() {
        items.clear()
    }

    fun getItem(position: Int) = items[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<B> =
        object : BaseViewHolder<B>(
            layoutRes = layoutRes,
            parent = parent,
            bindingVariableId = bindingVarianceId
        ) {}

    override fun onBindViewHolder(holder: BaseViewHolder<B>, position: Int) {
        holder.onBindViewHolder(items[position])
    }

    override fun getItemCount(): Int = items.size
}