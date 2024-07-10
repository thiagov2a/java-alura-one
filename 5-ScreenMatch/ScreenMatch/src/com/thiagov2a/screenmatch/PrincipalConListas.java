package com.thiagov2a.screenmatch;

import com.thiagov2a.screenmatch.modelo.Pelicula;
import com.thiagov2a.screenmatch.modelo.Serie;
import com.thiagov2a.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {

    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Titanic", 1997);
        pelicula1.calificar(5);

        Pelicula pelicula2 = new Pelicula("The Shawshank Redemption", 1994);
        pelicula2.calificar(4);

        Serie serie = new Serie("Game of Thrones", 2011);

        List<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(pelicula1);
        listaDeTitulos.add(pelicula2);
        listaDeTitulos.add(serie);

        for (Titulo item : listaDeTitulos) {
            System.out.println("Nombre: " + item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getCalificacion() > 2) {
                System.out.println("Clasificación: " + pelicula.getCalificacion());
            }
        }

        List<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Michael Jackson");
        listaDeArtistas.add("Madonna");
        listaDeArtistas.add("Elvis Presley");
        System.out.println("Lista de artistas: " + listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada por nombre: " + listaDeArtistas);

        Collections.sort(listaDeTitulos);
        System.out.println("Lista de películas ordenada por nombre: " + listaDeTitulos);

        listaDeTitulos.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista de películas ordenada por fecha: " + listaDeTitulos);
    }

}
