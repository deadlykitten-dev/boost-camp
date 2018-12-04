package com.kestrel9.android.boostcamp.searchMovie

import android.os.Bundle
import com.kestrel9.android.boostcamp.R
import com.kestrel9.android.boostcamp.base.BaseActivity
import com.kestrel9.android.boostcamp.databinding.ActivitySearchMovieBinding

class SearchMovieActivity : BaseActivity<ActivitySearchMovieBinding>(R.layout.activity_search_movie) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.run {
            setLifecycleOwner(this@SearchMovieActivity)
        }
    }
}
