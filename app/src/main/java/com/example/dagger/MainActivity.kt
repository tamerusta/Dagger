package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var kargo: Kargo
    @Inject
    lateinit var internet: Internet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerAppComponent.builder().build().inject(this)

        //kargo = Kargo()
        kargo.gonder()

        //internet = Internet()
        internet.basvuruYap()

    }
}