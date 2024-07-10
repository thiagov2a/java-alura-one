package com.thiagov2a.starwarsapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivos {

    public void guardarJSON(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter escritor = new FileWriter(pelicula.title() + ".json");
        escritor.write(gson.toJson(pelicula));
        escritor.close();
    }
}
