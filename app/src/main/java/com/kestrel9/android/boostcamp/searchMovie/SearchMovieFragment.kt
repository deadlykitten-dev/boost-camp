package com.kestrel9.android.boostcamp.searchMovie

import com.kestrel9.android.boostcamp.R
import com.kestrel9.android.boostcamp.base.BaseFragment
import com.kestrel9.android.boostcamp.databinding.FragmentSearchMovieBinding

/**
 * BoostCamp
 * Class: SearchMovieFragment
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
class SearchMovieFragment : BaseFragment<FragmentSearchMovieBinding>(R.layout.fragment_search_movie) {

    companion object {
        fun newInstance() = SearchMovieFragment()
    }
}