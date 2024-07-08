package com.thiagov2a.audiowave;

import com.thiagov2a.audiowave.entidades.Cancion;
import com.thiagov2a.audiowave.entidades.Favoritos;
import com.thiagov2a.audiowave.entidades.Podcast;

public class AudioWave {

    public static void main(String[] args) {
        Favoritos favoritos = new Favoritos();

        System.out.println("******************************");
        System.out.println("*   Bienvenido a AudioWave   *");
        System.out.println("******************************");

        Cancion cancion = new Cancion();
        cancion.setTitulo("De Musica Ligera");
        cancion.setDuracion(4);
        cancion.setArtista("Soda Stereo");
        cancion.setAlbum("Canción Animal");
        cancion.setGenero("Rock");

        for (int i = 0; i < 2000; i++) {
            cancion.reproducir();
        }

        for (int i = 0; i < 500; i++) {
            cancion.meGusta();
        }

        System.out.println("*----------------------------*");
        System.out.println("Cancion: " + cancion.getTitulo());
        System.out.println("Duracion: " + cancion.getDuracion() + " minutos");
        System.out.println("Artista: " + cancion.getArtista());
        System.out.println("Album: " + cancion.getAlbum());
        System.out.println("Genero: " + cancion.getGenero());
        System.out.println("Total de Me Gusta: " + cancion.getTotalDeMeGusta());
        System.out.println("Total de Reproducciones: " + cancion.getTotalDeReproducciones());
        System.out.println("*----------------------------*");
        favoritos.agregar(cancion);

        Podcast podcast = new Podcast();
        podcast.setTitulo("Podcast de Análisis");
        podcast.setDuracion(30);
        podcast.setPresentador("Juan Pérez");
        podcast.setDescripcion("Discusión sobre el análisis de datos");

        for (int i = 0; i < 350; i++) {
            podcast.reproducir();
        }

        for (int i = 0; i < 75; i++) {
            podcast.meGusta();
        }

        System.out.println("*----------------------------*");
        System.out.println("Podcast: " + podcast.getTitulo());
        System.out.println("Duracion: " + podcast.getDuracion() + " minutos");
        System.out.println("Presentador: " + podcast.getPresentador());
        System.out.println("Descripción: " + podcast.getDescripcion());
        System.out.println("Total de Me Gusta: " + podcast.getTotalDeMeGusta());
        System.out.println("Total de Reproducciones: " + podcast.getTotalDeReproducciones());
        System.out.println("*----------------------------*");
        favoritos.agregar(podcast);
        System.out.println("*----------------------------*");

    }
}
