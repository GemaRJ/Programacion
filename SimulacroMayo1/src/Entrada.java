import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("¡¡¡ Bienvenidos al Simulacro Final Mayo!!! Ejercicio 1");

        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];


        System.out.println("Introduce 10 números enteros:");

        // Guardamos los 10 números en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Mostrar contenido del array
        System.out.println("\nContenido del array:");
        Gestor.mostrarArray(numeros);

        // Calcular y mostrar la media
        double media = Gestor.calcularMedia(numeros);
        System.out.println("\nLa media es: " + media);

        // Ordenar array y mostrarlo
        Gestor.ordenarArray(numeros);
        System.out.println("\nArray ordenado de menor a mayor:");
        Gestor.mostrarArray(numeros);

        // Buscar un elemento en el array
        System.out.print("\nIntroduce un valor a buscar: ");
        int valorBuscar = teclado.nextInt();
        int posicion = Gestor.buscarElemento(numeros, valorBuscar);

        if (posicion >= 0) {
            System.out.println("El valor " + valorBuscar + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El valor " + valorBuscar + " no está en el array.");
        }

        teclado.close();
    }
}
