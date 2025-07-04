import java.util.Random;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("¡¡¡EL JUEGO DEL BINGO!!!");
        System.out.println("========================");

        int[] carton = new int[10]; // Cartón con 10 números

        System.out.println("Estos son tus números: ");
        // Generar números aleatorios para el cartón, asegurándose que no se repitan
        for (int i = 0; i < carton.length; i++) {
            boolean existe;
            do {
                existe = false;
                int numero = (int) (Math.random() * 99) + 1; // Números entre 1 y 99

                // Comprobar si el número ya está en el cartón
                for (int j = 0; j < carton.length; j++) {
                    if (carton[j] == numero) {
                        existe = true;
                        break;
                    }
                }

                // Si el número no existe en el cartón, se añade
                if (!existe) {
                    carton[i] = numero;
                    System.out.print(carton[i] + " ");
                }
            } while (existe);  // Repetir hasta encontrar un número no repetido
        }
        System.out.println(""); // Salto de línea
        System.out.println("-------------------");

        // Pedir datos al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos euros quieres apostar?");
        int apuesta = scanner.nextInt();

        System.out.println("¿Cuantos números crees que harán falta para cantar Línea?");
        int lineaEn = scanner.nextInt();

        System.out.println("¿Cuantos números crees que harán falta para cantar Bingo?");
        int bingoEn = scanner.nextInt();

        System.out.println("-------------------");

        System.out.println("¡Comienza el juego!");

        boolean bingo = false;
        boolean linea = false;
        int aciertos = 0;
        int numeros = 0;

        // Simular el sorteo de números
        do {
            int numero = (int) (Math.random() * 99) + 1; // Número aleatorio entre 1 y 99
            numeros++;

            System.out.println("Ha salido el " + numero);

            // Comprobar si el número ha salido en el cartón
            for (int i = 0; i < carton.length; i++) {
                if (carton[i] == numero) {
                    System.out.println("¡Lo tienes!");
                    aciertos++;
                    break;
                }
            }

            System.out.println("Tienes " + aciertos + " aciertos");

            // Comprobar si el jugador ha ganado el Bingo
            if (aciertos == 10) {
                bingo = true;
                System.out.println("Bingo!!!");
            }
            // Comprobar si el jugador ha ganado Línea
            else if (!linea && aciertos == 5) {
                linea = true;
                System.out.println("Línea!!!");

                if (numeros == lineaEn) {
                    System.out.println("Has acertado en cuantos números cantarías línea");
                }
            }
        } while (!bingo); // Continuar hasta que haya bingo

        System.out.println("Final del juego");
        System.out.println("Se han sacado " + numeros + " números");
        System.out.println("Apostaste " + apuesta + " euros a que cantabas Bingo en " + bingoEn + " números");

        // Comprobar si el jugador acertó en la cantidad de números para Bingo
        if (numeros == bingoEn) {
            System.out.println("Has acertado");
            System.out.println("Ganas " + apuesta * 10 + " euros");
        } else {
            System.out.println("Has perdido " + apuesta + " euros");
        }
    }
}
