package de.sixbits.chatty.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.sixbits.chatty.MyApplication
import de.sixbits.chatty.R
import de.sixbits.chatty.di.DaggerAppComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//          Inject Here
//          (application as MyApplication).appComponent
//          .productsComponent().create()

        setContentView(R.layout.activity_main)
    }
}