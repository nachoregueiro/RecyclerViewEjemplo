package com.murallromana.dam.segundo.recyclerviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.murallromana.dam.segundo.recyclerviewejemplo.R
import com.murallromana.dam.segundo.recyclerviewejemplo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}


