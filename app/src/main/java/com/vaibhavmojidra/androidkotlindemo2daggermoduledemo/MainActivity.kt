package com.vaibhavmojidra.androidkotlindemo2daggermoduledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerPlayGameComponent.create().getPlayGame().playGame()
    }
}