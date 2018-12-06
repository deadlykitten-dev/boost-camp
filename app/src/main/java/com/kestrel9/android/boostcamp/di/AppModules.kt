package com.kestrel9.android.boostcamp.di

import com.kestrel9.android.boostcamp.BuildConfig
import com.kestrel9.android.boostcamp.data.SearchDataSource
import com.kestrel9.android.boostcamp.data.SearchRepository
import com.kestrel9.android.boostcamp.network.SearchMovieApi
import com.kestrel9.android.boostcamp.searchMovie.SearchModelViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * BoostCamp
 * Class: AppModules
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
val networkModule: Module = module {
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
        Retrofit.Builder()
            .baseUrl(BuildConfig.searchUrl)
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SearchMovieApi::class.java)
    }
}

val repositoryModule: Module = module {
    single<SearchDataSource> {
        SearchRepository(get())
    }
}

val viewModelModule: Module = module {
    viewModel { SearchModelViewModel(get()) }
}

val appModules = listOf(networkModule, repositoryModule, viewModelModule)