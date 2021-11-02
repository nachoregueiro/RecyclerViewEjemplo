package com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.murallromana.dam.segundo.recyclerviewejemplo.R
import com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.Modelo.Entidades.Personaje
import com.squareup.picasso.Picasso

class ListaPersonajesAdapter(val personajes: List<Personaje>) : RecyclerView.Adapter<ListaPersonajesAdapter.PersonajesViewHolder>() {

    class PersonajesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNombre =itemView.findViewById<TextView>(R.id.tvNombre)
        val tvTitulo =itemView.findViewById<TextView>(R.id.tvTitulo)
        val ivFoto =itemView.findViewById<ImageView>(R.id.ivFoto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val layoutInflater =  LayoutInflater.from(parent.context)
            .inflate(R.layout.item_personaje_list,parent,false)

        return PersonajesViewHolder(layoutInflater)

    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        val personaje =personajes.get(position)

        holder.tvNombre.setText(personaje.nombre)
        holder.tvTitulo.setText(personaje.titulo)

        Picasso.get().
        load("http://c.files.bbci.co.uk/48DD/production/_107435681_perro1.jpg")
            .into(holder.ivFoto)

    }

    override fun getItemCount(): Int {
        return personajes.size
    }

}