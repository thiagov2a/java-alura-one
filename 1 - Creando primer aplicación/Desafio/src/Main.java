import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre = "Pablo";
        String tipoDeCuenta = "Corriente";
        double saldo = 100.00;
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        System.out.println("***********************************");
        System.out.println("Cliente: " + nombre);
        System.out.println("Tipo de Cuenta: " + tipoDeCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("***********************************");

        String menu = """
                \n*** Menú ***
                1. Consultar saldo
                2. Realizar depósito
                3. Realizar retiro
                4. Salir
                Elige una opción:
                """;
        while (opcion != 4) {
            System.out.print(menu);
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = input.nextDouble();
                    saldo += montoDeposito;
                    System.out.println("Depósito realizado. Nuevo saldo: $" + saldo);
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = input.nextDouble();
                    if (montoRetiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= montoRetiro;
                        System.out.println("Retiro realizado. Nuevo saldo: $" + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa…");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}