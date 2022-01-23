package com.example.debuggingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

fun logging() {
    fun logging() {
        Log.e("ErrorTag", "ERROR: a serious error like an app crash")
        Log.w("WarnTag", "WARN: warns about the potential for serious errors")
        Log.i("InfoTag", "INFO: reporting technical information, such as an operation succeeding")
        Log.d("DebugTag", "DEBUG: reporting technical information useful for debugging")
        Log.v("VerboseTag", "VERBOSE: more verbose than DEBUG logs")
    }

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
    }
}