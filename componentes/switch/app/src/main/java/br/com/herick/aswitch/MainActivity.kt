package br.com.herick.aswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.herick.aswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setStatus()

        binding.switch1.setOnCheckedChangeListener { _, check ->
            setStatus()
        }

    }

    private fun setStatus() {
        binding.textView2.text = if (binding.switch1.isChecked){
            "Ativo"
        }else{
            "Inativo"
        }
    }
}