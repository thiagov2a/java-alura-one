package com.thiagov2a.screenmatch.entidades;

import com.thiagov2a.screenmatch.interfaces.Clasificacion;

public class Episodio implements Clasificacion {

    private int numero;
    private String nombre;
    private Serie serie;
    private int visualizaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    @Override
    public int getCalificacion() {
        if (this.visualizaciones >= 500) {
            return 5;
        } else if (this.visualizaciones >= 350) {
            return 4;
        } else if (this.visualizaciones >= 100) {
            return 3;
        } else if (this.visualizaciones >= 50) {
            return 2;
        } else {
            return 1;
        }
    }
}
