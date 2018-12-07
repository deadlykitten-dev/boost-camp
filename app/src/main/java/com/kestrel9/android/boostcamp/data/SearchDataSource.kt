package com.kestrel9.android.boostcamp.data

import com.kestrel9.android.boostcamp.network.Movie

/**
 * BoostCamp
 * Class: SearchDataSource
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
interface SearchDataSource {
    fun getMovie(
            query: String,
            success: (listMovie: List<Movie>) -> Unit,
            failed: (errorCode: String) -> Unit
    )
}