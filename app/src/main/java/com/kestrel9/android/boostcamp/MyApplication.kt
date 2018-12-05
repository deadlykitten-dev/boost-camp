package com.kestrel9.android.boostcamp

import android.app.Application
import com.kestrel9.android.boostcamp.di.appModules
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
        startKoin(this, appModules)
    }
}