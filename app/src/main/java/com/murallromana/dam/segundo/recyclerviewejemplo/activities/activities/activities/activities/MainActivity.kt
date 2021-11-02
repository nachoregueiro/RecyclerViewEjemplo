package com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.activities

import com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.Modelo.Entidades.Personaje
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.murallromana.dam.segundo.recyclerviewejemplo.R
import com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.Modelo.dao.PersonajesDao
import com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.Modelo.dao.PersonajesDaoMockImpl
import com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.adapters.ListaPersonajesAdapter
import com.murallromana.dam.segundo.recyclerviewejemplo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        //Inflo las vistas
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Obtengo los datos de los personajes
        val personajesDao =PersonajesDaoMockImpl()
        val listaPersonajes =personajesDao.getTodos()


        //Creo los componentes
        val layoutManager = LinearLayoutManager(this)
        val adapter = ListaPersonajesAdapter(listaPersonajes)

        //Asocio el RecyclerView con sus componentes
        binding.rvListaPersonajes.adapter =adapter
        binding.rvListaPersonajes.layoutManager =layoutManager

        //Si la lista no va a cambiar
        binding.rvListaPersonajes.setHasFixedSize(true)



    }



}


