package org.example;

import java.util.Scanner;

public class calcularEdadPerro {
    public static void main(String[] args) {
        Scanner edad = new Scanner(System.in);

        System.out.println("Ingrese la edad de su perro en años humanos:");
        int edadHumana = edad.nextInt();

        int edadPerro = calcularEdadPerro(edadHumana);

        System.out.println("La edad de su perro en años de perro es: " + edadPerro);
    }

    public static int calcularEdadPerro(int edadHumana) {
        if (edadHumana <= 0) {
            return 0;
        }else if (edadHumana == 1) {
            return 7;
        }else {
            return 7 + calcularEdadPerro(edadHumana - 1);
        }
    }
}

