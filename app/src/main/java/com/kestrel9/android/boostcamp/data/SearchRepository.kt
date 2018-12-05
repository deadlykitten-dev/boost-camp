package com.kestrel9.android.boostcamp.data

import com.kestrel9.android.boostcamp.network.MovieResponse
import com.kestrel9.android.boostcamp.network.SearchMovieApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * BoostCamp
 * Class: SearchRepository
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
class SearchRepository(private val movieApi: SearchMovieApi) : SearchDataSource {
    override fun getMovie(query: String, success: (movieResponse: MovieResponse) -> Unit, failed: (errorCode: String) -> Unit) {
        movieApi.getMovieList(query = query).enqueue(object : Callback<MovieResponse> {
            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                failed("")
            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                response.body()?.let {
                    success(it)
                }
            }
        })

    }
}