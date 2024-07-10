package com.thiagov2a.screenmatch;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thiagov2a.screenmatch.excepciones.ConversionJSONException;
import com.thiagov2a.screenmatch.modelo.Titulo;
import com.thiagov2a.screenmatch.modelo.TituloOMDb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {
            System.out.print("Escribe el nombre del título a buscar (salir para finalizar): ");
            var nombrePelicula = input.nextLine();
            // Convertir el nombrePelicula a minúsculas y reemplazar los espacios en el símbolo +
            nombrePelicula = nombrePelicula.toLowerCase().replace(" ", "+");
            String direccion = "https://www.omdbapi.com/?t=" + nombrePelicula + "&apikey=bfc09ede";

            if (nombrePelicula.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                HttpClient client = HttpClient
                        .newHttpClient();
                HttpRequest request = HttpRequest
                        .newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                // System.out.println(json);

                TituloOMDb tituloOMDb = gson.fromJson(json, TituloOMDb.class);
                // System.out.println(tituloOMDb);
                if (tituloOMDb.title() == null) {
                    System.out.println("No se encontró el título");

                } else {
                    Titulo titulo = new Titulo(tituloOMDb);
                    System.out.println(titulo);
                    titulos.add(titulo);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error en la ejecución: " + e.getMessage());
            } catch (ConversionJSONException e) {
                System.out.println("Error al convertir el JSON: " + e.getMessage());
            }
        }
        if (titulos.isEmpty()) {
            System.out.println("No se encontraron títulos");
        } else {
            System.out.println("Se encontraron " + titulos.size() + " títulos");
            System.out.println(titulos);
            // Guardar los títulos en un archivo JSON
            FileWriter escritor = new FileWriter("titulos.json");
            escritor.write(gson.toJson(titulos));
            escritor.close();
        }
        System.out.println("Finalizó la ejecución del programa");
    }
}
