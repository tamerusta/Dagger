package com.example.dagger

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor(var adres: Adres){
    fun basvuruYap(){
        Log.e("İnternet","Başvuru ${adres.adresBilgisi} adresi için yapıldı.")
    }
}