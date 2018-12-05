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
    val testSting = MutableLiveData<String>()

    fun start() {
        searchRepository.getMovie("엑스맨",
                success = {
                    testSting.postValue(it.total.toString())
                },
                failed = {
                    testSting.postValue("실패")
                })
    }
}