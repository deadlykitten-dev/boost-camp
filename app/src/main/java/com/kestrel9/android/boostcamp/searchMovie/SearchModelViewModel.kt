package com.kestrel9.android.boostcamp.searchMovie

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.kestrel9.android.boostcamp.data.SearchDataSource

/**
 * BoostCamp
 * Class: SearchModelViewModel
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
class SearchModelViewModel(val searchRepository: SearchDataSource) : ViewModel() {

    val query = MutableLiveData<String>()
    val testSting = MutableLiveData<String>()

    fun start() {

    }

    fun search() {
        searchRepository.getMovie(query.value.toString(),

            success = {
                testSting.postValue(it.toString())
            },

            failed = {
                testSting.postValue("실패")
            })
    }
}