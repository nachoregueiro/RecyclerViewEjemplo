package com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.murallromana.dam.segundo.recyclerviewejemplo.R
import com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.Modelo.Entidades.Personaje
import com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.activities.DetallePersonajeActivity
import com.murallromana.dam.segundo.recyclerviewejemplo.databinding.ItemPersonajeListBinding
import com.squareup.picasso.Picasso

class ListaPersonajesAdapter(val personajes: List<Personaje>) : RecyclerView.Adapter<ListaPersonajesAdapter.PersonajesViewHolder>() {

    //cambiamos el findmyViewId por itemBinding

    /*también podemos crear un método que tenga el itemBinding para que solo lo llame
     en las partes posteriores*/

    /*fun enlazarDatos(personaje:Personaje){
        itemBinding.tvNombre.setText(personaje.nombre)
        itemBinding.tvTitulo.setText(personaje.titulo)
    }*/

    class PersonajesViewHolder( val itemBinding: ItemPersonajeListBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        val tvNombre = itemView.findViewById<TextView>(R.id.tvNombre)
        val tvTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
        val ivFoto = itemView.findViewById<ImageView>(R.id.ivFoto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PersonajesViewHolder(ItemPersonajeListBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        val personaje = personajes.get(position)


        holder.itemBinding.tvNombre.setText(personaje.nombre)
        holder.itemBinding.tvTitulo.setText(personaje.titulo)

    //para que vaya a otra activity
        holder.itemBinding.layoutItemPersonaje.setOnClickListener{
            val intent = Intent(holder.itemBinding.root.context,DetallePersonajeActivity::class.java)
            holder.itemBinding.root.context.startActivity(intent)

            intent.putExtra("personaje",personaje)


        }
        Picasso.get().load("http://c.files.bbci.co.uk/48DD/production/_107435681_perro1.jpg")
            .into(holder.itemBinding.ivFoto)

    }

    override fun getItemCount(): Int {
        return personajes.size
    }


}