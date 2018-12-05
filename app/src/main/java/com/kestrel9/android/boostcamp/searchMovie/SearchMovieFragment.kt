package com.kestrel9.android.boostcamp.searchMovie

import android.os.Bundle
import android.view.View
import com.kestrel9.android.boostcamp.R
import com.kestrel9.android.boostcamp.base.BaseFragment
import com.kestrel9.android.boostcamp.databinding.FragmentSearchMovieBinding
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * BoostCamp
 * Class: SearchMovieFragment
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
class SearchMovieFragment : BaseFragment<FragmentSearchMovieBinding>(R.layout.fragment_search_movie) {

    private val searchModelViewModel by viewModel<SearchModelViewModel>()

    companion object {
        fun newInstance() = SearchMovieFragment()
    }

    override fun onResume() {
        super.onResume()
        binding.viewModel?.start()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            viewModel = searchModelViewModel
        }


    }
}