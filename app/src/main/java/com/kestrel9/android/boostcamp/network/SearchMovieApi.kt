package com.kestrel9.android.boostcamp.network

import com.kestrel9.android.boostcamp.BuildConfig
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

/**
 * BoostCamp
 * Class: SearchMovieApi
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
interface SearchMovieApi {
    @GET(value = "v1/search/movie.json")
    fun getMovieList(
            @Header(value = "X-Naver-Client-Id") clientId: String = BuildConfig.clientId,
            @Header(value = "X-Naver-Client-Secret") clientSecret: String = BuildConfig.clientSecret,
            @Query(value = "query") query: String
    ): Call<MovieResponse>
}