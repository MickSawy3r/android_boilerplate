package de.sixbits.chatty

import android.app.Application
import de.sixbits.chatty.di.AppComponent
import de.sixbits.chatty.di.DaggerAppComponent

open class MyApplication : Application() {
    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent
            .factory()
            .create(applicationContext)
    }
}
