package clase_5;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Ingrese el precio original: ");
        double precioOriginal =num.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        double porcentajeDescuento = num.nextDouble();

        double descuento = precioOriginal * porcentajeDescuento / 100;
        double precioFinal = precioOriginal - descuento;

        System.out.println("El precio después del descuento es: " + precioFinal);

    }
}
