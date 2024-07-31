package com.example.dagger

import android.util.Log
import javax.inject.Inject

class Kargo @Inject constructor(var adres: Adres){

    fun gonder(){
        Log.e("Kargo","Kargo ${adres.adresBilgisi} adresine gönderildi.")
    }
}