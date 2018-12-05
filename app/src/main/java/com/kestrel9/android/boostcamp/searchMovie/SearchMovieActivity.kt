package com.kestrel9.android.boostcamp.searchMovie

import android.os.Bundle
import com.kestrel9.android.boostcamp.R
import com.kestrel9.android.boostcamp.base.BaseActivity
import com.kestrel9.android.boostcamp.databinding.ActivitySearchMovieBinding
import com.kestrel9.android.boostcamp.util.replaceFragmentInActivity
import org.koin.android.viewmodel.ext.android.viewModel

class SearchMovieActivity : BaseActivity<ActivitySearchMovieBinding>(R.layout.activity_search_movie) {

    private val searchModelViewModel by viewModel<SearchModelViewModel>()
    private val searchMovieFragment by lazy {
        SearchMovieFragment.newInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        replaceFragmentInActivity(searchMovieFragment, binding.flContainer.id)
        binding.run {
            viewModel = searchModelViewModel
        }
    }
}
