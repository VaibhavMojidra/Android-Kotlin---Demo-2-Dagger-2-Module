package com.vaibhavmojidra.androidkotlindemo2daggermoduledemo

import android.util.Log
import javax.inject.Inject

class PlayGame @Inject constructor(val game:Game,val smartPhone:SmartPhone,val internet:Internet){
    init {
        game.isGameDownloaded()
        smartPhone.doesSmartphoneSupportsTheGame()
        internet.isInternetAvailable()
        Log.i("MyTag","PlayGame class initialized")
    }

    fun playGame(){
        Log.i("MyTag","Game is ready to play")
    }
}