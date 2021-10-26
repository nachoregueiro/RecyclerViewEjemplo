package com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.activities

import com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.Modelo.Entidades.Personaje
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.murallromana.dam.segundo.recyclerviewejemplo.R
import com.murallromana.dam.segundo.recyclerviewejemplo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val layoutManager = LinearLayoutManager(this)

        val p= Personaje (0,"Daenerys","Targaryen","Madre de dragones","Casa Targaryen","https://thronesapi.com/assets/images/daenerys.jpg")
        println(p.nombre)

    }

}


