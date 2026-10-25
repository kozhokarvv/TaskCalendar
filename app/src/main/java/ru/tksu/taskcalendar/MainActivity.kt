package ru.tksu.taskcalendar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivityLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: Activity создана")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: Activity стала видимой")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: Activity готова к взаимодействию")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: Activity теряет фокус")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: Activity больше не видна")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: Activity уничтожается")
    }
}