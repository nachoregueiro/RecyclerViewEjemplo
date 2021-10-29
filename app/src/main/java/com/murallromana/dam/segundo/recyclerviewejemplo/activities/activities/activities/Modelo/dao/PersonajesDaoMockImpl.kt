package com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.Modelo.dao

import com.murallromana.dam.segundo.recyclerviewejemplo.activities.activities.activities.Modelo.Entidades.Personaje

class PersonajesDaoMockImpl :PersonajesDao {

   /* override fun getTodos() = ListOf(
        Personaje (0,"Ramsey","Bolton","El bastardo de los Bolton","Bolton","https://thronesapi.com/assets/images/ramsey-bolton.jpg")
        Personaje (1,"Daenerys","Targaryen","Madre de dragones","Casa Targaryen","https://thronesapi.com/assets/images/daenerys.jpg")
        Personaje (2,"Tyrion","Lannister","Mano de la reina","Casa Lanister","https://thronesapi.com/assets/images/tyrion-lannister.jpg")
        Personaje (3,"Samwell","Tarly","Maestro","Casa Tarly","https://thronesapi.com/assets/images/sam.jpg")
        Personaje (4,"Jaqen","H'ghar","Hombre sin rostro de Bravos","Lorath","https://thronesapi.com/assets/images/jaqen-hghar.jpg")
        Personaje (5,"Hodor","Hodor","Sirviente de la casa Stark","Casa Stark","https://thronesapi.com/assets/images/hodor.jpg")
    )*/



    override fun getTodos(): List<Personaje> {
        val p= Personaje (0,"Ramsey","Bolton","El bastardo de los Bolton","Bolton","https://thronesapi.com/assets/images/ramsey-bolton.jpg")
        val p1= Personaje (1,"Daenerys","Targaryen","Madre de dragones","Casa Targaryen","https://thronesapi.com/assets/images/daenerys.jpg")
        val p2= Personaje (2,"Tyrion","Lannister","Mano de la reina","Casa Lanister","https://thronesapi.com/assets/images/tyrion-lannister.jpg")
        val p3= Personaje (3,"Samwell","Tarly","Maestro","Casa Tarly","https://thronesapi.com/assets/images/sam.jpg")
        val p4= Personaje (4,"Jaqen","H'ghar","Hombre sin rostro de Bravos","Lorath","https://thronesapi.com/assets/images/jaqen-hghar.jpg")
        val p5= Personaje (5,"Hodor","Hodor","Sirviente de la casa Stark","Casa Stark","https://thronesapi.com/assets/images/hodor.jpg")

    val listaPersonajes = listOf(p,p1,p2,p3,p4,p5)
        return listaPersonajes



   // override fun getTodos(): List<Personaje> {
        /*   return listOf(
        Personaje (0,"Ramsey","Bolton","El bastardo de los Bolton","Bolton","https://thronesapi.com/assets/images/ramsey-bolton.jpg")
       Personaje (1,"Daenerys","Targaryen","Madre de dragones","Casa Targaryen","https://thronesapi.com/assets/images/daenerys.jpg")
        Personaje (2,"Tyrion","Lannister","Mano de la reina","Casa Lanister","https://thronesapi.com/assets/images/tyrion-lannister.jpg")
       Personaje (3,"Samwell","Tarly","Maestro","Casa Tarly","https://thronesapi.com/assets/images/sam.jpg")
        Personaje (4,"Jaqen","H'ghar","Hombre sin rostro de Bravos","Lorath","https://thronesapi.com/assets/images/jaqen-hghar.jpg")
       Personaje (5,"Hodor","Hodor","Sirviente de la casa Stark","Casa Stark","https://thronesapi.com/assets/images/hodor.jpg")
        )
*/


    }
}