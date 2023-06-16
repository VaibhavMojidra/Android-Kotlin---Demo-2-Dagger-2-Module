package com.vaibhavmojidra.androidkotlindemo2daggermoduledemo

import dagger.Module
import dagger.Provides

@Module
class InternetModule {

    @Provides
    fun providesInternet():Internet{
        return Internet()
    }
}