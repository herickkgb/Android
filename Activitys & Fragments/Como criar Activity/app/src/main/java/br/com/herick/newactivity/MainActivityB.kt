package br.com.herick.newactivity

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import br.com.herick.newactivity.databinding.ActivityMainBBinding
import br.com.herick.newactivity.databinding.ActivityMainBinding

class MainActivityB : AppCompatActivity() {
    private lateinit var binding: ActivityMainBBinding
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        voltarActivity()


    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun voltarActivity() {
        binding.btnTelaB.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        getExtra()
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun getExtra(){
        var user = intent.getSerializableExtra("user",User) as User
        Log.i("Inforteste","$user.name")
        Log.i("Inforteste","$user.age")
    }
}