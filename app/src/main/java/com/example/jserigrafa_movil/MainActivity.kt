package com.example.jserigrafa_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jserigrafa_movil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind=ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.seriboton.setOnClickListener {
            val intent= Intent(this,Serigrafia::class.java)
            startActivity(intent)
        }
        bind.tampoboton.setOnClickListener {
            val intent=Intent(this, Tampografia::class.java)
            startActivity(intent)
        }
        bind.moleskinboton.setOnClickListener {
            val intent=Intent(this,Moleskines::class.java)
            startActivity(intent)
        }
        bind.contacto.setOnClickListener {
            val intent=Intent(this,Contacto::class.java)
            startActivity(intent)
        }


    }
}