package com.thiagov2a.screenmatch.entidades;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public void incluye(Titulo titulo) {
        tiempoTotal += titulo.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
