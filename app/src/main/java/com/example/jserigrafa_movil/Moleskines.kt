package com.example.jserigrafa_movil

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.jserigrafa_movil.databinding.ActivityMoleskinesBinding

class Moleskines : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind=ActivityMoleskinesBinding.inflate(layoutInflater)
        setContentView(bind.root)
        val spinnercol4=bind.spinnercolor3
        val lista4=listOf("1","2","3","4","5")
        val adaptador3=ArrayAdapter(this, R.layout.simple_spinner_item,lista4)
        spinnercol4.adapter=adaptador3
        val spinnerpant4=bind.spinnerpantalla3
        val lista5=listOf("1","2","3","4","5")
        val adaptador4=ArrayAdapter(this,R.layout.simple_spinner_item,lista5)
        spinnerpant4.adapter=adaptador4

        var cliente:String=""
        var producto:String=""
        var kantidad:Int=0
        var precio:Double=0.0
        var colores:Int=0
        var pantalla:Int=0
        var posicion:Int=0
        val miMotor3=Motor3()

        bind.Calcular3.setOnClickListener {
            var cliente= bind.nombreedit3.text.toString()
            var producto:String=bind.productoedit3.text.toString()
            var kantidad:Int=bind.cantidadedit3.text.toString().toInt()

            var colores:Int = bind.spinnercolor3.selectedItem.toString().toInt()
            var pantalla:Int=bind.spinnerpantalla3.selectedItem.toString().toInt()
            var precio:String=""
            miMotor3.Calculo(kantidad)
            miMotor3.color(colores,miMotor3.resultado)
            precio=miMotor3.CalculoPantalla(pantalla,miMotor3.precio,posicion).toString()
            bind.precioedit3.setText(precio)

        }
        bind.volver3.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        bind.borrar3.setOnClickListener {
            bind.nombreedit3.setText("")
            bind.cantidadedit3.setText("")
            bind.precioedit3.setText("")
            bind.productoedit3.setText("")


        }
        bind.enviar3.setOnClickListener {
            val intent=Intent(this,Enviar::class.java)
            val bundle=Bundle()
            bundle.putString("cliente",bind.nombreedit3.text.toString())
            bundle.putString("producto",bind.productoedit3.text.toString())
            bundle.putInt("cantidad",bind.cantidadedit3.text.toString().toInt())
            bundle.putString("precio",bind.Precio3.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)

        }



    }
}