package com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.murallromana.dam.segundo.recyclerviewejemplo.R
import com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.Modelo.Entidades.Personaje

class DetallePersonajeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_personaje)

        //el interrogante es por si es nulo que ignore esta linea
        //"as" es un elemento de casteo (pasar un tipo de dato a otro distinto)
        val personaje = intent.extras?.get("personaje") as Personaje


        /*pregunta si el personaje es distinto de nulo con el nombre del personaje da el nombre
        "Nuevo personaje"*/
        /*if(personaje!=null)setTitle(personaje.nombre)
        else setTitle("Nuevo personaje")*/

        //sirve para cambiar el titulo de la activity
        setTitle("Detalle personaje")


    }
}