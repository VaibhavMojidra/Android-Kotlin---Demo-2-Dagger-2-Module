package com.vaibhavmojidra.androidkotlindemo2daggermoduledemo

import dagger.Module;
import dagger.Provides

@Module
class GameModule {

    @Provides
    fun providesGame():Game{
        return Game()
    }
}
