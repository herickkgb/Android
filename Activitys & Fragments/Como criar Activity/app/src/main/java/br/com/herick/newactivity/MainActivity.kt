package br.com.herick.newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.herick.newactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initListener()

    }

    private fun initListener() {
        binding.btnTelaA.setOnClickListener {

            val intent = Intent(this, MainActivityB::class.java)
            startActivity(intent)

        }
    }
}