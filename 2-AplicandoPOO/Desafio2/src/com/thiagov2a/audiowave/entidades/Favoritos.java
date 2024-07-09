package com.thiagov2a.audiowave.entidades;

public class Favoritos {

    public void agregar(Audio audio) {
        if (audio.getClasificacion() >= 4) {
            System.out.println("Es una selección de los favoritos");
        } else if (audio.getClasificacion() >= 2) {
            System.out.println("Es un clásico de los favoritos");
        } else {
            System.out.println("No es de los mejores");
        }
    }
}
