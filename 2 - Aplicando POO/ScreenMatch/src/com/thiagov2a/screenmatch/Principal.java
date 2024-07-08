package com.thiagov2a.screenmatch;

import com.thiagov2a.screenmatch.entidades.Pelicula;

public class Principal {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        pelicula.setNombre("Titanic");
        pelicula.setFechaDeLanzamiento(1997);
        pelicula.setDuracionEnMinutos(180);
        pelicula.setIncluidoEnElPlan(true);

        pelicula.setSumaDeLasCalificaciones(0);
        pelicula.setNumeroDeCalificaciones(0);
        pelicula.calificar(4);
        pelicula.calificar(5);
        pelicula.calificar(3);

        pelicula.muestraFichaTecnica();
    }
}
