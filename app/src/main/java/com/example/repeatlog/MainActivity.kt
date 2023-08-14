package com.example.repeatlog

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifyCycel","Application onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifyCycel", "Application onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifyCycel", "Application onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifyCycel", "Application onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifyCycel", "Application onDestroy")
    }

}

fun logging() {
    Log.i("LifyCycel", "Hello wold!")
}