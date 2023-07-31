package br.com.herick.pg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import br.com.herick.pg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
       setStatus()
        binding.toggleButton.setOnCheckedChangeListener{_,_ ->
            setStatus()
        }

    }

    private fun setStatus() {
        if ( binding.toggleButton.isChecked ){
            binding.progressBar.isVisible = false
        }else{
            binding.progressBar.isVisible = true
        }
    }
}