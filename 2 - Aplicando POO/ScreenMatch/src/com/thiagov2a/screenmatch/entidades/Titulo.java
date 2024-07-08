package com.thiagov2a.screenmatch.entidades;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasCalificaciones;
    private int numeroDeCalificaciones;

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
}
