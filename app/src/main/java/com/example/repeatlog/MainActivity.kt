package com.example.repeatlog

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
const val TAG = "lifecykel"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "Application onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Application onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "Application onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "Application onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "Application onDestroy")
    }

}

fun logging() {
    Log.i(TAG, "Hello wold!")
}