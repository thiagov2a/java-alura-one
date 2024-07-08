public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEnCelsius = 30.4;
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %.2f Celsius es equivalente a %.2f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);
        System.out.println(mensaje);

        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);
    }
}
