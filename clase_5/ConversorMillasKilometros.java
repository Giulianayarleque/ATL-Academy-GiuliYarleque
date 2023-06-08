package org.example;

import java.util.Scanner;
//Aquí se declara la clase principal del programa llamada ConversorMillasKilometros.
public class ConversorMillasKilometros {
    //Se define el método principal main, que es el punto de entrada del programa.
    public static void main(String[] args) {
        //Se crea una instancia de la clase Scanner llamada scanner, que se utiliza para leer la entrada del usuario.
        Scanner distancia = new Scanner(System.in);

        //Se muestra un mensaje en la consola solicitando al usuario que ingrese una distancia en millas.
        System.out.println("Ingrese una distancia en millas:");
        //Se lee el valor ingresado por el usuario y se almacena en la variable millas como un número de tipo double.
        double millas = distancia.nextDouble();

        //Se llama al método convertirMillasAKilometros pasando la variable millas como argumento y se guarda el resultado en la variable kilometros.
        double kilometros = convertirMillasAKilometros(millas);

        //Se muestra el resultado de la conversión al usuario, concatenando las variables millas y kilometros en el mensaje de salida.
        System.out.println(millas + " millas equivale a " + kilometros + " kilómetros. ");
    }

    //Se define el método convertirMillasAKilometros, que recibe un parámetro millas de tipo double y devuelve un valor de tipo double.
    public static double convertirMillasAKilometros(double millas) {
        //En este método, se realiza la conversión de millas a kilómetros multiplicando la distancia en millas por el factor de conversión 1.60934. El resultado se devuelve como un valor de tipo double.
        return millas * 1.60934;
    }
}
