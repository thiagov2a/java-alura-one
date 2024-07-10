package com.thiagov2a.screenmatch;

import com.thiagov2a.screenmatch.util.CalculadoraDeTiempo;
import com.thiagov2a.screenmatch.util.FiltroDeRecomendacion;
import com.thiagov2a.screenmatch.modelo.*;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        FiltroDeRecomendacion filtro = new FiltroDeRecomendacion();

        Pelicula pelicula1 = new Pelicula("Titanic", 1997);
        pelicula1.setDuracionEnMinutos(180);
        pelicula1.setIncluidoEnElPlan(true);
        pelicula1.setDirector("James Cameron");

        pelicula1.setSumaDeLasCalificaciones(0);
        pelicula1.setNumeroDeCalificaciones(0);
        pelicula1.calificar(4);
        pelicula1.calificar(5);
        pelicula1.calificar(3);

        pelicula1.muestraFichaTecnica();
        filtro.filtrar(pelicula1);

        Serie serie = new Serie("Game of Thrones", 2011);
        serie.setIncluidoEnElPlan(false);
        serie.setTemporadas(8);
        serie.setEpisodiosPorTemporada(73);
        serie.setMinutosPorEpisodio(50);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Winter Is Coming");
        episodio.setVisualizaciones(300);

        serie.setSumaDeLasCalificaciones(0);
        serie.setNumeroDeCalificaciones(0);
        serie.calificar(4);
        serie.calificar(5);
        serie.calificar(2);

        serie.muestraFichaTecnica();
        filtro.filtrar(episodio);

        Pelicula pelicula2 = new Pelicula("The Shawshank Redemption", 1994);
        pelicula2.setDuracionEnMinutos(142);
        pelicula2.setIncluidoEnElPlan(true);
        pelicula2.setDirector("Frank Darabont");

        pelicula2.setSumaDeLasCalificaciones(0);
        pelicula2.setNumeroDeCalificaciones(0);
        pelicula2.calificar(5);
        pelicula2.calificar(4);
        pelicula2.calificar(3);

        pelicula2.muestraFichaTecnica();
        filtro.filtrar(pelicula2);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(pelicula1);
        calculadora.incluye(serie);
        calculadora.incluye(pelicula2);

        System.out.println("---------------------------------------");
        System.out.println("Tiempo total de visionado: " + calculadora.getTiempoTotal() + " minutos");
        System.out.println("---------------------------------------");

        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);

        System.out.println("Tamaño de la lista: " + peliculas.size());
        System.out.println("Contenido de la lista: " + peliculas);

    }
}
