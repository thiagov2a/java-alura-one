package com.thiagov2a.screenmatch.calculos;

public class FiltroDeRecomendacion {

    public void filtrar(Clasificacion clasificacion) {
        if (clasificacion.getCalificacion() >= 4) {
            System.out.println("Mejor evaluado en el momento");
        } else if (clasificacion.getCalificacion() >= 3) {
            System.out.println("¡Bueno para ti!");
        } else {
            System.out.println("Para ver luego");
        }
    }
}
