package com.example.jserigrafa_movil

class Motor3 {
    var precio=0.0
    var precio100=25.0
    var precio299=0.18
    var precio499=0.16
    var precio999=0.14
    var precio2999=0.12
    var precio3000=0.10
    val preciopantalla1 = 25.0
    var resultado2= 0.0
    var resultado = 0.0
    var preciofinal=0.0



    fun Calculo(kantidad:Int):Double{
        when {
            kantidad<=100 ->{
                resultado2=25.0
                resultado=resultado2
                return resultado
            }
        }
        when {
            kantidad <=299 ->{
                resultado2=kantidad*0.18
                resultado=resultado2
                return  resultado
            }
        }
        when {
            kantidad <=499 ->{
                resultado2=kantidad*0.16
                resultado=resultado2
                return  resultado
            }
        }
        when {
            kantidad <=999 ->{
                resultado2=kantidad*0.14
                resultado=resultado2
                return  resultado
            }
        }
        when {
            kantidad <=2999 ->{
                resultado2=kantidad*0.12
                resultado=resultado2
                return resultado
            }
        }
        when {
            kantidad >= 3000 ->{
                resultado2=kantidad*0.10
                resultado=resultado2
                return resultado
            }
            else ->{
                return 0.0

            }
        }

    }

    fun color(colores: Int,  resultado:Double):Double{

        when {
            colores.equals(1) ->{
                this.precio =colores*resultado
                return precio
            }
        }
        when {
            colores.equals(2) ->{
                this.precio =colores*resultado
                return precio
            }
        }
        when {
            colores.equals(3) ->{
                this.precio =colores*resultado
                return precio
            }

        }
        when{
            colores.equals(4) ->{
                this.precio =colores*resultado
                return precio
            }

        }
        when{
            colores.equals(5) ->{
                this.precio =colores*resultado
                return precio

            }
            else ->{
                return 0.0
            }

        }


    }
    fun CalculoPantalla(pantalla: Int,precio: Double, posicion:Int):Double{
        when {
            pantalla.equals(1) ->{
                this.preciofinal = (preciopantalla1 * 1) + precio
                return preciofinal
            }
        }
        when {
            pantalla.equals(2) ->{
                this.preciofinal = (preciopantalla1 * 2) + precio
                return preciofinal
            }
        }
        when {
            pantalla.equals(3) ->{
                this.preciofinal = (preciopantalla1 * 3) + precio
                return preciofinal
            }
        }
        when {
            pantalla.equals(4) ->{
                this.preciofinal = (preciopantalla1 * 4) + precio
                return preciofinal
            }
        }
        when {
            pantalla.equals(5) ->{
                this.preciofinal = (preciopantalla1 * 5) + precio
                return preciofinal
            }
            else ->{
                return 0.0
            }
        }



    }
}