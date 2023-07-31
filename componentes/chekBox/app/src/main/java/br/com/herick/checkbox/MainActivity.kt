package br.com.herick.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import br.com.herick.checkbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.checkBox.setOnClickListener {
            setSelecionado()
        }
    }

    private fun setSelecionado() {
        if (binding.checkBox.isChecked) {
            binding.checkBox.text = "Selecionado"
        } else if (!binding.checkBox.isChecked){
            binding.checkBox.text = "Não selecionado"
        }

    }
}