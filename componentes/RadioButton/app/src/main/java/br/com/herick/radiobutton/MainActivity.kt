package br.com.herick.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.herick.radiobutton.databinding.ActivityMainBinding
import javax.net.ssl.SSLSessionBindingEvent

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.radioGroup.setOnCheckedChangeListener { _, id ->

            when (id) {
                R.id.radioButton1 -> {
                    binding.textView.text = binding.radioButton1.text
                }

                R.id.radioButton2 -> {
                    binding.textView.text = binding.radioButton2.text
                }

                R.id.radioButton3 -> {
                    binding.textView.text = binding.radioButton3.text
                }
            }
        }
    }
}