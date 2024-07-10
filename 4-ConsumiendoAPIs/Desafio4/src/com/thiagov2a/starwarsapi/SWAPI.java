package com.thiagov2a.starwarsapi;

import java.io.IOException;
import java.util.Scanner;

public class SWAPI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConsultaPelicula consultaPelicula = new ConsultaPelicula();

        System.out.print("Ingrese el número de la película de Star Wars: ");
        try {
            var numeroDePelicula = Integer.valueOf(input.nextLine());

            Pelicula pelicula = consultaPelicula.buscarPelicula(numeroDePelicula);
            System.out.println(pelicula);

            GeneradorDeArchivos generadorDeArchivos = new GeneradorDeArchivos();
            generadorDeArchivos.guardarJSON(pelicula);
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un número.");
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }
        input.close();
    }
}
