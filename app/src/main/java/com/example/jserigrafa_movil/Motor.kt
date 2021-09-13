package com.example.jserigrafa_movil

class Motor(/*var cliente: String, var producto: String,var kantidad: Int,   var colores:Int, var pantalla:Int*/) {

    var precio: Double = 0.0
    var resultado: Double = 0.0
    var preciofinal:Double=0.0

    //3
    val preciopantalla3 = 25.0
    val precio100seccion3 = 25.0
    val precio299seccion3 = 0.24
    val precio499seccion3 = 0.22
    val precio999seccion3 = 0.20
    val precio2999seccion3 = 0.18
    val precio3000seccion3 = 0.16
    var resultado3 = 0.0

    //seccion 4
    val preciopantalla4 = 25.0
    val precio100seccion4 = 30
    val precio299seccion4 = 0.28
    val precio499seccion4 = 0.27
    val precio999seccion4 = 0.26
    val precio2999seccion4 = 0.25
    val precio3000seccion4 = 0.24
    var resultado4 = 0.0

    //seccion 5
    val preciopantalla5 = 25.0
    val precio100seccion5 = 24
    val precio299seccion5 = 0.22
    val precio499seccion5 = 0.21
    val precio999seccion5 = 0.18
    val precio2999seccion5 = 0.17
    val precio3000seccion5 = 0.12
    var resultado5 = 0.0

    val preciopantalla6 = 25.0
    val precio100seccion6 = 25
    val precio299seccion6 = 0.24
    val precio499seccion6 = 0.22
    val precio999seccion6 = 0.20
    val precio2999seccion6 = 0.18
    val precio3000seccion6 = 0.16
    var resultado6 = 0.0

    /* init {
    this.cliente
    this.kantidad
    this.precio
    this.producto
    }*/

    fun seccion3(kantidad: Int): Double {
        when {
            kantidad <= 100 -> {
                resultado3 = 25.0
                resultado = resultado3
                return resultado

            }
        }
        when {
            kantidad <= 299 -> {
                this.resultado3 = 0.24 * kantidad
                resultado = resultado3
                return resultado
            }
        }
        when {
            kantidad <= 499 -> {
                this.resultado3 = precio499seccion3 * kantidad
                resultado = resultado3
                return resultado
            }
        }
        when {
            kantidad <= 999 -> {
                this.resultado3 = precio999seccion3 * kantidad
                resultado = resultado3
                return resultado
            }
        }
        when {
            kantidad <= 2999 -> {
                this.resultado3 = precio2999seccion3 * kantidad
                resultado = resultado3
                return resultado
            }
        }
        when {
            kantidad >= 3000 -> {
                this.resultado3 = precio3000seccion3 * kantidad
                resultado = resultado3
                return resultado
            }
            else ->{
                return 0.0
            }
        }


    }
    fun seccion4(kantidad: Int): Double {
        when {
            kantidad <= 100 -> {
                resultado4 = precio100seccion4.toDouble()
                resultado = resultado4
                return resultado
            }
        }
        when {
            kantidad <= 299 -> {
                this.resultado4 = precio299seccion4 * kantidad.toDouble()
                resultado = resultado4
                return resultado
            }
        }
        when {
            kantidad <= 499 -> {
                this.resultado4 = precio499seccion4 * kantidad
                resultado = resultado4
                return resultado
            }
        }
        when {
            kantidad <= 999 -> {
                this.resultado4 = precio999seccion4 * kantidad
                resultado = resultado4
                return resultado
            }
        }
        when {
            kantidad <= 2999 -> {
                this.resultado4 = precio2999seccion4 * kantidad
                resultado = resultado4
                return resultado
            }
        }
        when {
            kantidad >= 3000 -> {
                this.resultado4 = precio3000seccion4 * kantidad
                resultado = resultado4
                return resultado
            }
            else ->{
                return 0.0
            }

        }


    }
    fun seccion5(kantidad: Int): Double {
        when {
            kantidad <= 100 -> {
                resultado5 = precio100seccion5.toDouble()
                resultado = resultado5
                return resultado
            }
        }
        when {
            kantidad <= 299 -> {
                this.resultado5 = precio299seccion5 * kantidad.toDouble()
                resultado = resultado5
                return resultado
            }
        }
        when {
            kantidad <= 499 -> {
                this.resultado5 = precio499seccion5 * kantidad
                resultado = resultado5
                return resultado
            }
        }
        when {
            kantidad <= 999 -> {
                this.resultado5 = precio999seccion5 * kantidad
                resultado = resultado5
                return resultado
            }
        }
        when {
            kantidad <= 2999 -> {
                this.resultado5 = precio2999seccion4 * kantidad
                resultado = resultado5
                return resultado
            }
        }
        when {
            kantidad >= 3000 -> {
                this.resultado5 = precio3000seccion5 * kantidad
                resultado = resultado5
                return resultado
            }
            else ->{
                return 0.0
            }

        }


    }
    fun seccion6(kantidad: Int): Double {
        when {
            kantidad <= 100 -> {
                resultado6 = precio100seccion6.toDouble()
                resultado = resultado6
                return resultado
            }
        }
        when {
            kantidad <= 299 -> {
                this.resultado6 = precio299seccion6 * kantidad.toDouble()
                resultado = resultado6
                return resultado
            }
        }
        when {
            kantidad <= 499 -> {
                this.resultado6 = precio499seccion6 * kantidad
                resultado = resultado6
                return resultado
            }
        }
        when {
            kantidad <= 999 -> {
                this.resultado6 = precio999seccion6 * kantidad
                resultado = resultado6
                return resultado
            }
        }
        when {
            kantidad <= 2999 -> {
                this.resultado6 = precio2999seccion6 * kantidad
                resultado = resultado6
                return resultado
            }
        }
        when {
            kantidad >= 3000 -> {
                this.resultado6 = precio3000seccion6 * kantidad
                resultado = resultado6
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
    fun calculoPantalla(pantalla: Int,precio: Double, preciopantalla3:Double, posicion:Int):Double {
        when {
            pantalla == 1 -> {
                if (posicion == 3) {
                    this.preciofinal = (preciopantalla3 * 1) + precio
                    return preciofinal
                } else if (posicion == 4) {
                    this.preciofinal = (preciopantalla4 * 1) + precio
                    return preciofinal
                }else if(posicion==5){
                    this.preciofinal = (preciopantalla5 * 1) + precio
                    return preciofinal

                }else if(posicion==6){
                    this.preciofinal = (preciopantalla6 * 1) + precio
                    return preciofinal

                }
            }
        }
        when {
            pantalla == 2 -> {
                if (posicion == 3) {
                    this.preciofinal = (preciopantalla3 * 2) + precio
                    return preciofinal
                } else if (posicion == 4) {
                    this.preciofinal = (preciopantalla4 * 2) + precio
                    return preciofinal
                } else if (posicion == 5) {
                    this.preciofinal = (preciopantalla5 * 2) + precio
                    return preciofinal
                } else if (posicion == 6) {
                    this.preciofinal = (preciopantalla6 * 2) + precio
                    return preciofinal
                }
            }
        }
        when {
            pantalla == 3 -> {

                if (posicion == 3) {
                    this.preciofinal = (preciopantalla3 * 3) + precio
                    return preciofinal
                } else if (posicion == 4) {
                    this.preciofinal = (preciopantalla4 * 3) + precio
                    return preciofinal
                }else if (posicion == 5) {
                    this.preciofinal = (preciopantalla5 * 3) + precio
                    return preciofinal
                }else if(posicion==6){
                    this.preciofinal = (preciopantalla6 * 3) + precio
                    return preciofinal
                }
            }
        }
        when {
            pantalla == 4 -> {
                if (posicion == 3) {
                    this.preciofinal = (preciopantalla3 * 4) + precio
                    return preciofinal
                } else if (posicion == 4) {
                    this.preciofinal = (preciopantalla4 * 4) + precio
                    return preciofinal
                }else if (posicion == 5) {
                    this.preciofinal = (preciopantalla4 * 4) + precio
                    return preciofinal

                }else if(posicion== 6){
                    this.preciofinal = (preciopantalla6 * 4) + precio
                    return preciofinal

                }
            }
        }
        when {
            pantalla == 5 -> {
                if (posicion == 3) {
                    this.preciofinal = (preciopantalla3 * 5) + precio
                    return preciofinal
                } else if (posicion == 4) {
                    this.preciofinal = (preciopantalla4 * 5) + precio
                    return preciofinal
                }else if (posicion == 5) {
                    this.preciofinal = (preciopantalla5 * 5) + precio
                    return preciofinal
                }else if(posicion == 6) {
                        (preciopantalla6 * 5)+precio
                }
            }

        }
            return 0.0







    }


}


