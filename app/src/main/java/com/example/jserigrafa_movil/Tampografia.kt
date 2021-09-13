package com.example.jserigrafa_movil

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import com.example.jserigrafa_movil.databinding.ActivityTampografiaBinding

class Tampografia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind=ActivityTampografiaBinding.inflate(layoutInflater)
        setContentView(bind.root)
        val spinner=bind.seccionspin2
        val lista= listOf("seccion1","seccion2")
        val adaptador= ArrayAdapter(this, R.layout.simple_spinner_item,lista)
        spinner.adapter=adaptador
        var spinnercolor=bind.spinnercolor2
        var lista2= listOf("1","2","3","4","5")
        val adaptador2=ArrayAdapter(this,R.layout.simple_spinner_item,lista2)
        spinnercolor.adapter=adaptador2
        val spinnerpantalla=bind.spinnerpantalla2
        val lista3= listOf("1","2","3","4","5")
        val adaptador3=ArrayAdapter(this,R.layout.simple_spinner_item,lista3)
        spinnerpantalla.adapter=adaptador3

        var cliente:String=""
        var producto:String=""
        var kantidad:Int=0
        var precio:Double=0.0
        var colores:Int=0
        var pantalla:Int=0
        var posicion:Int=0

        var miMotor2=Motor2()
        bind.volver2.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        bind.Calcular2.setOnClickListener {
            var cliente:String=bind.nombreedit2.text.toString()
            var producto:String=bind.productoedit2.text.toString()
            var kantidad:Int=bind.cantidadedit2.text.toString().toInt()
            var precio:String=""

            var colores:Int = bind.spinnercolor2.selectedItem.toString().toInt()
            var pantalla:Int=bind.spinnerpantalla2.selectedItem.toString().toInt()
            val seleccion=spinner.selectedItem.toString()
            if(seleccion=="seccion1"){
                posicion=1
                miMotor2.seccion1(kantidad)
                miMotor2.color(colores,miMotor2.resultado)
                precio=miMotor2.calculoPantalla(pantalla,miMotor2.precio,miMotor2.preciopantalla1,miMotor2.preciopantalla2,posicion).toString()
                bind.precioedit2.setText(precio)

                Log.d("TAG","mi resultado" +miMotor2.precio)

            }else if(seleccion=="seccion2"){
                posicion=2
                miMotor2.seccion2(kantidad)
                miMotor2.color(colores,miMotor2.resultado)
                precio=miMotor2.calculoPantalla(pantalla,miMotor2.precio,miMotor2.preciopantalla1,miMotor2.preciopantalla2,posicion).toString()
                bind.precioedit2.setText(precio)
            }
        }
        bind.borrar2.setOnClickListener {
            bind.nombreedit2.setText("")
            bind.cantidadedit2.setText("")
            bind.precioedit2.setText("")
            bind.productoedit2.setText("")


        }
        bind.enviar2.setOnClickListener {
            val intent=Intent(this,Enviar::class.java)
            val bundle=Bundle()
            bundle.putString("cliente",bind.nombreedit2.text.toString())
            bundle.putString("producto",bind.productoedit2.text.toString())
            bundle.putInt("cantidad",bind.cantidad2.text.toString().toInt())
            bundle.putString("precio",bind.Precio2.text.toString())
            intent.putExtras(bundle)

            startActivity(intent)
        }

    }




}