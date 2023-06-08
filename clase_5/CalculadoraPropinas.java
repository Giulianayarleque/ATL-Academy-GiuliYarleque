package clase_5;

import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner monto = new Scanner(System.in);

        // Pedir al usuario que ingrese el total de la cuenta
        System.out.println("Ingrese el total de la cuenta: ");
        double totalCuenta = monto.nextDouble();

        // Pedir al usuario que ingrese el porcentaje de propina
        System.out.println("Ingrese el pocentaje de propina: ");
        double porcentajePropina = monto.nextDouble();

        // Calcular el monto de la propina
        double propina = totalCuenta * (porcentajePropina / 100);

        // Mostrar el monto de la propina al usuario
        System.out.println("El monto de la propina es: " + propina);
    }
}
