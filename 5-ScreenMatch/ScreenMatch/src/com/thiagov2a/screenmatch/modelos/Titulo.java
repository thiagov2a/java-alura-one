package com.thiagov2a.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import com.thiagov2a.screenmatch.excepciones.ConversionJSONException;
import org.jetbrains.annotations.NotNull;

public class Titulo implements Comparable<Titulo> {

    @SerializedName("Title")
    private String nombre;

    @SerializedName("Year")
    private int fechaDeLanzamiento;

    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasCalificaciones;
    private int numeroDeCalificaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOMDb tituloOMDb) {
        this.nombre = tituloOMDb.title();

        if (tituloOMDb.year().contains("N/A")) {
            throw new ConversionJSONException("No se pudo obtener el año de lanzamiento del título");
        }
        this.fechaDeLanzamiento = Integer.parseInt(tituloOMDb.year().substring(0, 4));

        if (tituloOMDb.runtime().contains("N/A")) {
            throw new ConversionJSONException("No se pudo obtener la duración del título");
        }
        this.duracionEnMinutos = Integer.parseInt(tituloOMDb.runtime().substring(0, tituloOMDb.runtime().indexOf(" ")));
    }

    public void muestraFichaTecnica() {
        System.out.println("---------------------------------------");
        System.out.println("Título: " + nombre);
        System.out.println("Año de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Incluida en el plan: " + incluidoEnElPlan);
        System.out.printf("Calificación: %.2f%n", calcularPromedioCalificaciones());
        System.out.println("---------------------------------------");
    }

    public void calificar(double calificacion) {
        sumaDeLasCalificaciones += calificacion;
        numeroDeCalificaciones++;
    }

    public double calcularPromedioCalificaciones() {
        return sumaDeLasCalificaciones / numeroDeCalificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public double getSumaDeLasCalificaciones() {
        return sumaDeLasCalificaciones;
    }

    public void setSumaDeLasCalificaciones(double sumaDeLasCalificaciones) {
        this.sumaDeLasCalificaciones = sumaDeLasCalificaciones;
    }

    public int getNumeroDeCalificaciones() {
        return numeroDeCalificaciones;
    }

    public void setNumeroDeCalificaciones(int numeroDeCalificaciones) {
        this.numeroDeCalificaciones = numeroDeCalificaciones;
    }

    @Override
    public String toString() {
        return "Título: " + nombre + " (" + fechaDeLanzamiento + ") " + duracionEnMinutos + " min";
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
