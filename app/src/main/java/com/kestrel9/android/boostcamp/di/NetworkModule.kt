package com.kestrel9.android.boostcamp.di

import com.kestrel9.android.boostcamp.BuildConfig
import com.kestrel9.android.boostcamp.network.SearchMovieApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module.module
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * BoostCamp
 * Class: NetworkModule
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
val networkModule = module {
    single {
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = if (BuildConfig.DEBUG) {
                    HttpLoggingInterceptor.Level.BODY
                } else {
                    HttpLoggingInterceptor.Level.NONE
                }
            }).build()
    }

    single {
        GsonConverterFactory.create() as Converter.Factory
    }

    single {
        Retrofit.Builder()
            .baseUrl(BuildConfig.searchUrl)
            .client(get())
            .addConverterFactory(get())
            .build()
            .create(SearchMovieApi::class.java)
    }
}