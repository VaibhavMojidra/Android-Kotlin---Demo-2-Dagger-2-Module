package com.vaibhavmojidra.androidkotlindemo2daggermoduledemo

import dagger.Component

@Component(modules = [GameModule::class,InternetModule::class])
interface PlayGameComponent {
    fun getPlayGame():PlayGame
}