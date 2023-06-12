package clase_7;

import java.util.Scanner;

public class IngresaNumeros {
    public static void main(String[] args) {
        //declarar variables con sus respectivos tipos
        int[] numeros = new int[5];
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int suma = 0;
        double promedio;

        Scanner num = new Scanner(System.in);

        //Solicitar al usuario que ingrese los números
        System.out.println("Ingrese 5 números: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Número " + (i + 1) + ": ");
            numeros[1] = num.nextInt();
        }

        //Mostrar los números ingresados
        System.out.println("Los números ingresados son:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.println(numeros[i]);

            // Actualizar el número mayor y menor
            if(numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if(numeros[i] < menor) {
                menor = numeros[i];
            }

            //Calcular la suma
            suma += numeros[i];
        }

        //Calcular el promedio
        promedio = (double) suma / numeros.length;

        //Mostrar el número mayor, menor y el promedio
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}
