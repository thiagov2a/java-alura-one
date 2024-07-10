package com.thiagov2a.screenmatch.modelo;

import com.thiagov2a.screenmatch.util.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String director;

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Película: " + this.getNombre() + " (" + this.getFechaDeLanzamiento() + ")";
    }

    @Override
    public int getCalificacion() {
        return (int) (calcularPromedioCalificaciones());
    }
}
