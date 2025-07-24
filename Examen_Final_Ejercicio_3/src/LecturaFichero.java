import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaFichero {

    public static void main(String[] args) {
        // Usa doble barra invertida o una barra normal
        File file = new File("C:\\Users\\gr\\IdeaProjects\\Examen_Final_Ejercicio_3\\src\\Ejercicio3.txt");

        int contadorLetras = 0;
        int contadorPalabras = 0;

        try (Scanner lector = new Scanner(file)) { // <- Cerrado correctamente el paréntesis
            System.out.println("Contenido del archivo:\n");

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);

                // Contar letras (solo caracteres alfabéticos)
                for (char c : linea.toCharArray()) {
                    if (Character.isLetter(c)) {
                        contadorLetras++;
                    }
                }

                // Contar palabras
                String[] palabras = linea.trim().split("\\s+");
                if (!linea.trim().isEmpty()) {
                    contadorPalabras += palabras.length;
                }
            }

            System.out.println("\nNúmero total de letras: " + contadorLetras);
            System.out.println("Número total de palabras: " + contadorPalabras);

        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}