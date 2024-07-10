package com.thiagov2a.screenmatch.util;

import com.thiagov2a.screenmatch.modelo.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public void incluye(Titulo titulo) {
        tiempoTotal += titulo.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
