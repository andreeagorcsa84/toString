package com.example.tostringcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jack = User(id = 0, name = "Jack", gender = true, address = "NY, USA")
        println(jack.toString())
        Log.d(TAG, jack.toString())
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}