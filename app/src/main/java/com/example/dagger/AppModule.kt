package com.example.dagger

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideAdres() : Adres {
        return Adres("İzmit/Kocaeli")
    }
}