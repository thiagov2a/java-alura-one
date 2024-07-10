package com.thiagov2a.starwarsapi.servicio;

import com.google.gson.Gson;
import com.thiagov2a.starwarsapi.modelo.Pelicula;
import org.ietf.jgss.GSSContext;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {

    public Pelicula buscarPelicula(int numeroDePelicula) {
        URI url = URI.create("https://swapi.dev/api/films/" + numeroDePelicula);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(url).build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("No se encontró la película.");
        }

        return new Gson().fromJson(response.body(), Pelicula.class);
    }
}
