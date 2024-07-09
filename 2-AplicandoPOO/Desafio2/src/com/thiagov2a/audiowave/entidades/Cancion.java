package com.thiagov2a.audiowave.entidades;

public class Cancion extends Audio {

    private String artista;
    private String album;
    private String genero;

    @Override
    public int getClasificacion() {
        if (getTotalDeMeGusta() >= 500) {
            return 5;
        } else if (getTotalDeMeGusta() >= 250) {
            return 4;
        } else if (getTotalDeMeGusta() >= 100) {
            return 3;
        } else if (getTotalDeMeGusta() >= 50) {
            return 2;
        } else {
            return 1;
        }
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
