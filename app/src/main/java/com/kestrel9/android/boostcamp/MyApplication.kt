package com.kestrel9.android.boostcamp

import android.app.Application
import com.kestrel9.android.boostcamp.di.appModule
import com.kestrel9.android.boostcamp.di.networkModule
import com.kestrel9.android.boostcamp.di.viewModelModule
import org.koin.android.ext.android.startKoin

/**
 * BoostCamp
 * Class: MyApplication
 * Created by kestr on 2018-12-04.
 *
 * Description:
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // start Koin context
        startKoin(
                this, listOf(networkModule, viewModelModule, appModule)
        )
    }
}