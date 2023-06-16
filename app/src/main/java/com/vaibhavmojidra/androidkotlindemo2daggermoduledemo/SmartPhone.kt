package com.vaibhavmojidra.androidkotlindemo2daggermoduledemo

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(){
    init {
        Log.i("MyTag","SmartPhone class initialized")
    }

    fun doesSmartphoneSupportsTheGame(){
        Log.i("MyTag","Smartphone supports gaming")
    }
}
