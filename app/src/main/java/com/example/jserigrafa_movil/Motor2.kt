package com.example.jserigrafa_movil

class Motor2 {
    var precio: Double = 0.0
    var resultado: Double = 0.0
    var preciofinal:Double=0.0
    //1
    val preciopantalla1 = 25.0
    val precio200seccion1 = 22.0
    val precio499seccion1 = 28.0

    val precio999seccion1 = 0.06
    val precio2999seccion1 = 0.05
    val precio4999seccion1 = 0.04
    val mas5000seccion1=0.035
    var resultado1 = 0.0
    //2
    val preciopantalla2 = 25.0
    val precio200seccion2 = 24
    val precio499seccion2 = 0.1
    val precio999seccion2 = 0.09
    val precio2999seccion2 = 0.08
    val precio4999seccion2= 0.07
    val masde5000seccion2= 0.06
    var resultado2= 0.0

    fun seccion1(kantidad: Int): Double {
        when {
            kantidad <= 200 -> {
                resultado1 = precio200seccion1
                resultado = resultado1
                return resultado

            }
        }
        when {
            kantidad <= 499 -> {
                this.resultado1 = precio499seccion1 
                resultado = resultado1
                return resultado
            }
        }
        when {
            kantidad <= 999 -> {
                this.resultado1 = precio999seccion1 * kantidad
                resultado = resultado1
                return resultado
            }
        }
        when {
            kantidad <= 2999 -> {
                this.resultado1 = precio2999seccion1 * kantidad
                resultado = resultado1
                return resultado
            }
        }
        when {
            kantidad <= 4999 -> {
                this.resultado1 = precio4999seccion1 * kantidad
                resultado = resultado1
                return resultado
            }
        }
        when {
            kantidad >= 5000 -> {
                this.resultado1 = mas5000seccion1 * kantidad
                resultado = resultado1
                return resultado
            }
            else ->{
                return 0.0
            }
        }


    }
    fun seccion2(kantidad: Int): Double {
        when {
            kantidad <= 200 -> {
                resultado2 = precio200seccion2.toDouble()
                resultado = resultado2
                return resultado
            }
        }
        when {
            kantidad <= 499 -> {
                this.resultado2 = precio499seccion2 * kantidad.toDouble()
                resultado = resultado2
                return resultado
            }
        }
        when {
            kantidad <= 999 -> {
                this.resultado2 = precio999seccion2 * kantidad
                resultado = resultado2
                return resultado
            }
        }
        when {
            kantidad <= 2999 -> {
                this.resultado2 = precio2999seccion2 * kantidad
                resultado = resultado2
                return resultado
            }
        }
        when {
            kantidad <= 4999 -> {
                this.resultado2 = precio4999seccion2 * kantidad
                resultado = resultado2
                return resultado
            }
        }
        when {
            kantidad >= 5000 -> {
                this.resultado2 = masde5000seccion2 * kantidad
                resultado = resultado2
                return resultado
            }
            else ->{
                return 0.0
            }

        }


    }
    fun  color(colores: Int,  resultado:Double):Double{
        when{
            colores.equals(1) ->
                this.precio =colores*resultado

        }
        when{
            colores.equals(2) ->{
                this.precio=colores*resultado
                return precio
            }

        }
        when{
            colores.equals(3) ->{
                this.precio=colores*resultado
                return precio
            }


        }
        when{
            colores.equals(4) ->{
                this.precio=colores*resultado
                return precio
            }

        }
        when{
            colores.equals(5) ->{
                this.precio=colores*resultado
                return precio
            }else ->{
            return 0.0
        }

        }



    }
    fun calculoPantalla(pantalla: Int,precio: Double, preciopantalla1:Double,preciopantalla2:Double, posicion:Int):Double {
        when {
            pantalla == 1 -> {
                if (posicion == 1) {
                    this.preciofinal = (preciopantalla1 * 1) + precio
                    return preciofinal
                } else if (posicion == 2) {
                    this.preciofinal = (preciopantalla2 * 1) + precio
                    return preciofinal
                }
            }
        }
        when {
            pantalla == 2 -> {
                if (posicion == 1) {
                    this.preciofinal = (preciopantalla1 * 2) + precio
                    return preciofinal
                } else if (posicion == 2) {
                    this.preciofinal = (preciopantalla2 * 2) + precio
                    return preciofinal
                }
            }
        }
        when {
            pantalla == 3 -> {

                if (posicion == 1) {
                    this.preciofinal = (preciopantalla1 * 3) + precio
                    return preciofinal
                } else if (posicion == 2) {
                    this.preciofinal = (preciopantalla2 * 3) + precio
                    return preciofinal
                }
            }
        }
        when {
            pantalla == 4 -> {
                if (posicion == 1) {
                    this.preciofinal = (preciopantalla1 * 4) + precio
                    return preciofinal
                } else if (posicion == 2) {
                    this.preciofinal = (preciopantalla2 * 4) + precio
                    return preciofinal
                }
            }
        }
        when {
            pantalla == 5 -> {
                if (posicion == 1) {
                    this.preciofinal = (preciopantalla1 * 5) + precio
                    return preciofinal
                } else if (posicion == 2) {
                    this.preciofinal = (preciopantalla2 * 5) + precio
                    return preciofinal
                }
            }

        }
        return 0.0







    }

}