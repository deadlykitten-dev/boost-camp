package com.kestrel9.android.boostcamp.di

import com.kestrel9.android.boostcamp.data.SearchDataSource
import com.kestrel9.android.boostcamp.data.SearchRepository
import com.kestrel9.android.boostcamp.searchMovie.SearchModelViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

/**
 * BoostCamp
 * Class: ViewModule
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
val appModule = module {
    single<SearchDataSource> {
        SearchRepository(get())
    }
}
val viewModelModule = module {
    viewModel { SearchModelViewModel(get()) }
}