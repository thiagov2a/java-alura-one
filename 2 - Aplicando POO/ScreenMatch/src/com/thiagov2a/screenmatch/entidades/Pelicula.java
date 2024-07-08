package com.thiagov2a.screenmatch.entidades;

import com.thiagov2a.screenmatch.interfaces.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getCalificacion() {
        return (int) (calcularPromedioCalificaciones());
    }
}
