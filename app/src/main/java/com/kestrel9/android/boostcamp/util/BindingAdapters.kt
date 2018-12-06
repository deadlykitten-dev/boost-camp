package com.kestrel9.android.boostcamp.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kestrel9.android.boostcamp.base.BaseRecyclerViewAdapter

/**
 * BoostCamp
 * Class: BindingAdapters
 * Created by kestr on 2018-12-06.
 *
 * Description:
 */

@BindingAdapter(value = ["replaceAll"])
fun RecyclerView.replaceAll(list: List<Any>?) {
    @Suppress("UNCHECKED_CAST")
    (this.adapter as? BaseRecyclerViewAdapter<Any, *>)?.let {
        it.replaceAll(list)
        it.notifyDataSetChanged()
    }
}

@BindingAdapter(value = ["imageUrl"])
fun ImageView.imageUrl(url: String?) {
    url?.let {
        Glide.with(this)
            .load(url)
            .into(this)
    }
}