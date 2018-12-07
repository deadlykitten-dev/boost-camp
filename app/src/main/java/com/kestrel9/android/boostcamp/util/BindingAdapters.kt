package com.kestrel9.android.boostcamp.util

import android.os.Build
import android.text.Html
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
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


@BindingAdapter(value = ["htmlText"])
fun TextView.htmlText(str: String?) {
    str?.let {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            this.text = Html.fromHtml(str, Html.FROM_HTML_MODE_LEGACY)
        } else {
            @Suppress("DEPRECATION")
            this.text = Html.fromHtml(str)
        }
    }
}

@BindingAdapter(value = ["setUserRating"])
fun RatingBar.setUserRating(rating: Float?) {
    rating?.let {
        this.rating = rating.div(2)
    }
}