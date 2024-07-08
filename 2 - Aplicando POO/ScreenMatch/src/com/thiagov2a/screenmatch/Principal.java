package com.thiagov2a.screenmatch;

import com.thiagov2a.screenmatch.entidades.*;

public class Principal {

    public static void main(String[] args) {
        FiltroDeRecomendacion filtro = new FiltroDeRecomendacion();

        Pelicula pelicula = new Pelicula();
        pelicula.setNombre("Titanic");
        pelicula.setFechaDeLanzamiento(1997);
        pelicula.setDuracionEnMinutos(180);
        pelicula.setIncluidoEnElPlan(true);
        pelicula.setDirector("James Cameron");

        pelicula.setSumaDeLasCalificaciones(0);
        pelicula.setNumeroDeCalificaciones(0);
        pelicula.calificar(4);
        pelicula.calificar(5);
        pelicula.calificar(3);

        pelicula.muestraFichaTecnica();
        filtro.filtrar(pelicula);

        Serie serie = new Serie();
        serie.setNombre("Game of Thrones");
        serie.setFechaDeLanzamiento(2011);
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

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(pelicula);
        calculadora.incluye(serie);

        System.out.println("---------------------------------------");
        System.out.println("Tiempo total de visionado: " + calculadora.getTiempoTotal() + " minutos");
        System.out.println("---------------------------------------");

    }
}
