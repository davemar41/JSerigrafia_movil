package com.example.jserigrafa_movil

import android.R
import android.app.PendingIntent.getActivity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.jserigrafa_movil.databinding.ActivitySerigrafiaBinding

class Serigrafia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind= ActivitySerigrafiaBinding.inflate(layoutInflater)
        setContentView(bind.root)
        val spinner=bind.seccionspin
        val lista= listOf("seccion3","seccion4","seccion5","seccion6")
        val adaptador=ArrayAdapter(this, R.layout.simple_spinner_item,lista)
        spinner.adapter=adaptador
        val spinnercol=bind.spinnercolor
        val lista2= listOf("1","2","3","4","5")
        val adaptador2=ArrayAdapter(this,R.layout.simple_spinner_item,lista2)
        spinnercol.adapter=adaptador2
        val spinnerpantalla=bind.spinnerpantalla
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


        val miMotor=Motor(/*cliente,producto,kantidad,colores,pantalla*/)



        bind.volver.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        bind.Calcular.setOnClickListener {
             var cliente:String=bind.nombreedit.text.toString()
            var producto:String=bind.productoedit.text.toString()
            var kantidad:Int=bind.cantidadedit.text.toString().toInt()


            var colores:Int = bind.spinnercolor.selectedItem.toString().toInt()
            var pantalla:Int=bind.spinnerpantalla.selectedItem.toString().toInt()

            val seleccion=spinner.selectedItem.toString()
            if(seleccion=="seccion3"){
                var precio:String=""
                posicion=3
                miMotor.seccion3(kantidad)
                miMotor.color(colores,miMotor.resultado)
                precio=miMotor.calculoPantalla(pantalla,miMotor.precio,miMotor.preciopantalla3,posicion).toString()
                bind.precioedit.setText(precio)

                Log.d("TAG","mi resultado" +miMotor.precio)

            }else if(seleccion=="seccion4"){
                var precio:String=""
                posicion=4
                miMotor.seccion4(kantidad)
                miMotor.color(colores,miMotor.resultado)
                precio=miMotor.calculoPantalla(pantalla,miMotor.precio,miMotor.preciopantalla4,posicion).toString()
                bind.precioedit.setText(precio)
            }else if(seleccion=="seccion5"){
                var precio:String=""
                posicion=5
                miMotor.seccion5(kantidad)
                miMotor.color(colores,miMotor.resultado)
                precio=miMotor.calculoPantalla(pantalla,miMotor.precio,miMotor.preciopantalla5,posicion).toString()
                bind.precioedit.setText(precio)
            }else if(seleccion=="seccion6"){
                var precio:String=""
                posicion=6
                miMotor.seccion6(kantidad)
                miMotor.color(colores,miMotor.resultado)
                precio=miMotor.calculoPantalla(pantalla,miMotor.precio,miMotor.preciopantalla6,posicion).toString()
                bind.precioedit.setText(precio)
                Log.d("TAG","mi resultado" +miMotor.precio+" "+miMotor.preciofinal)
            }

        }
        bind.borrar.setOnClickListener {
            bind.nombreedit.setText("")
            bind.cantidadedit.setText("")
            bind.precioedit.setText("")
            bind.productoedit.setText("")


        }
        bind.enviar.setOnClickListener {
            val intent=Intent(this,Enviar::class.java)
            val bundle=Bundle()
            bundle.putString("cliente",bind.nombreedit.text.toString())
            bundle.putString("producto",bind.productoedit.text.toString())
            bundle.putInt("cantidad",bind.cantidadedit.text.toString().toInt())
            bundle.putString("precio",bind.precioedit.text.toString())
            intent.putExtras(bundle)


            startActivity(intent)
        }



    }
}