package com.example.jserigrafa_movil

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jserigrafa_movil.databinding.ActivityContactoBinding

class Contacto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind=ActivityContactoBinding.inflate(layoutInflater)
        setContentView(bind.root)
        var mail=""
        var comentarios=""
        var cliente=""


        bind.enviargmail5.setOnClickListener {
            cliente=bind.editcliente5.text.toString()

            mail=bind.editemail5.text.toString()
            comentarios=bind.cuerpoedit5.text.toString()
            val intentmail=Intent(Intent.ACTION_SEND, Uri.parse("dmarthinn@gmail.com"))
            intentmail.type="plain/text"
            intentmail.putExtra(Intent.EXTRA_EMAIL, arrayOf(mail))
            intentmail.putExtra(Intent.EXTRA_SUBJECT,"presupuesto para " +cliente)
            intentmail.putExtra(Intent.EXTRA_TEXT,comentarios)
            startActivity(Intent.createChooser(intentmail,"elija su proovedor de correo"))
        }






        bind.borrar5.setOnClickListener {
            bind.editcliente5.setText("")
            bind.editemail5.setText("")
            bind.cuerpoedit5.setText("")
        }
        bind.volver5.setOnClickListener {
            bind.editcliente5.setText("")
            bind.editemail5.setText("")
            bind.cuerpoedit5.setText("")
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}