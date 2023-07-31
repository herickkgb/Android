package br.com.herick.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.herick.imageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.ic_launcher_foreground)
        }
    }
}