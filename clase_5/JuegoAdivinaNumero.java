package clase_5;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100
        Random random = new Random();
        int numeroAdivinador = random.nextInt(100) + 1;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("adivina el número entre 1 y 100: ");
        int numeroUsuario = scanner.nextInt();

        // Verificar si el número del usuario es igual al número a adivinar
        if (numeroUsuario == numeroAdivinador) {
            System.out.println("¡Felicidades! Adivinaste el número.");
        }else {
            System.out.println("Lo siento, el número correcto era: " + numeroAdivinador);
        }
    }
}
