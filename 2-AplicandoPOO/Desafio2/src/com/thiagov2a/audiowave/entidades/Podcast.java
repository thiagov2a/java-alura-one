package com.thiagov2a.audiowave.entidades;

public class Podcast extends Audio {

    private String presentador;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if (getTotalDeMeGusta() >= 250) {
            return 5;
        } else if (getTotalDeMeGusta() >= 100) {
            return 4;
        } else if (getTotalDeMeGusta() >= 50) {
            return 3;
        } else if (getTotalDeMeGusta() >= 25) {
            return 2;
        } else {
            return 1;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
