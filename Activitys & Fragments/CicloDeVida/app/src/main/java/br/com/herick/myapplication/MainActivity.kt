package br.com.herick.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.i("Start","ON-Teste")
        super.onStart()
    }

    override fun onResume() {
        Log.i("Resume","ON-Teste")

        super.onResume()
    }

    override fun onPause() {
        Log.i("Pause","ON-Teste")
        super.onPause()
    }

    override fun onStop() {
        Log.i("Strop","ON-Teste")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("Destroy","ON-Teste")
        super.onDestroy()
    }
}