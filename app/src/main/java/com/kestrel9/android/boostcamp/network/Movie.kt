package com.kestrel9.android.boostcamp.network

import com.google.gson.annotations.SerializedName

/**
 * BoostCamp
 * Class: Movie
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
data class Movie(
    @SerializedName("actor")
    val actor: String,
    @SerializedName("director")
    val director: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("link")
    val link: String,
    @SerializedName("pubDate")
    val pubDate: String,
    @SerializedName("subtitle")
    val subtitle: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("userRating")
    val userRating: String
)