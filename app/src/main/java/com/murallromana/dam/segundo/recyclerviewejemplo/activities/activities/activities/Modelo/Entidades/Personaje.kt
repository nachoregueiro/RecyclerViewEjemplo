package com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.Modelo.Entidades

class Personaje(
    var id: Long,
    var nombre: String,
    var apellido: String,
    var titulo:String,
    var familia:String,
    var url:String
    )

        {
        fun obtenerNombreyApellidos() :String{
           return nombre+" "+apellido
        }



            //Otras formas de hacerlo:
             /*fun getNombreCompleto2():String{
             return "El nombre es:${this.nombre} y el apellido es: ${this.apellido}"
         }
           fun getNombreCompleto3()="El nombre es:  ${this.nombre} y el apellido es: ${this.apellido}"
           */
        }
