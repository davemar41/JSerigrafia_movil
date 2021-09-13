package com.example.jserigrafa_movil

import android.R
import android.annotation.SuppressLint
import android.app.PendingIntent.getActivity
import android.content.Intent
import android.net.Uri
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.jserigrafa_movil.databinding.ActivityEnviarBinding


class Enviar : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bind=ActivityEnviarBinding.inflate(layoutInflater)


        setContentView(bind.root)
        var mail=""
        var comentarios=""
        var bundle=intent.extras
        var cliente= bundle?.getString("cliente")
        var producto=bundle?.getString("producto")
        var cantidad: Int? = bundle?.getInt("cantidad")
        var precio:String?=bundle?.getString("precio")
        Log.d("TAG","el cliente es" + cliente)
        Log.d("TAG","el producto es" + producto)
        Log.d("TAG","la cantidad es" + cantidad)
        Log.d("TAG","el precio es" +precio)
        bind.editcliente.setText(cliente)





        /*bind.editemail.setText(correo)
         bind.cuerpoedit.setText("El presupuesto de ${cantidad}para el cliente ${correo} es de ${precio.toString()} iva no incluido ")*/

        bind.enviargmail.setOnClickListener {
            Log.d("TAG","el correo es " +cliente)
            comentarios=bind.cuerpoedit.text.toString()
            Log.d("TAG",comentarios)
            mail=bind.editemail.text.toString()

            val mail:String?=mail
            val intentmail=Intent(Intent.ACTION_SEND, Uri.parse("dmarthinn@gmail.com"))

            intentmail.type="plain/text"
            intentmail.putExtra(Intent.EXTRA_EMAIL, arrayOf(mail))
            intentmail.putExtra(Intent.EXTRA_SUBJECT,"presupuesto para "+ cliente)
            intentmail.putExtra(Intent.EXTRA_TEXT,"El presupuesto de ${cantidad} de ${producto} para el cliente ${cliente} es de " +precio +" iva no incluido " +'\n'+comentarios)

            startActivity(Intent.createChooser(intentmail,"elija su prooveedor de correo"))




        }
        bind.borrar4.setOnClickListener {
            bind.editcliente.setText("")
            bind.editemail.setText("")
            bind.cuerpoedit.setText("")
        }
        bind.volver4.setOnClickListener {
            bind.editcliente.setText("")
            bind.editemail.setText("")
            bind.cuerpoedit.setText("")
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}