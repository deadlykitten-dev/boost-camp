package com.kestrel9.android.boostcamp.searchMovie

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kestrel9.android.boostcamp.data.SearchDataSource
import com.kestrel9.android.boostcamp.network.Movie

/**
 * BoostCamp
 * Class: SearchModelViewModel
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
class SearchModelViewModel(val searchRepository: SearchDataSource) : ViewModel() {

    val query = MutableLiveData<String>()
    val movies = MutableLiveData<List<Movie>>()

    fun start() {

    }

    fun search() {
        searchRepository.getMovie(query.value.toString(),

            success = {
                movies.postValue(it)
            },

            failed = {
            })
    }
}