import java.util.Scanner;
import Excepciones.*;

public class Formulario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "", apellidos = "", dni = "", email = "";
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ FORMULARIO ---");
            System.out.println("1. Rellenar nombre");
            System.out.println("2. Rellenar apellidos");
            System.out.println("3. Rellenar DNI");
            System.out.println("4. Rellenar e-mail");
            System.out.println("5. Finalizar");
            System.out.print("Elige opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Introduce nombre: ");
                        nombre = scanner.nextLine();
                        if (!nombre.replace(" ", "").chars().allMatch(Character::isLetter))
                            throw new TipoDatoIncorrectoException();
                    }
                    case 2 -> {
                        System.out.print("Introduce apellidos: ");
                        apellidos = scanner.nextLine();
                       if (!apellidos.replace("","").chars().allMatch(Character::isLetter))
                           throw new TipoDatoIncorrectoException();
                    }
                    case 3 -> {
                        System.out.print("Introduce DNI: ");
                        dni = scanner.nextLine();
                        if (dni.length() != 9)
                            throw new LongitudDNINoValidaException();
                        if (!Character.isLetter(dni.charAt(8)))
                            throw new UltimoDigitoNoLetraException();
                        if (!dni.substring(0, 8).chars().allMatch(Character::isDigit))
                            throw new NumeracionContieneLetrasException();
                    }
                    case 4 -> {
                        System.out.print("Introduce e-mail: ");
                        email = scanner.nextLine();
                        if (!email.contains("@") || !email.contains("."))
                            throw new EmailIncorrectoException();
                    }
                    case 5 -> {
                        if (nombre.isEmpty() || apellidos.isEmpty() || dni.isEmpty() || email.isEmpty()) {
                            System.out.println("Faltan datos por rellenar.");
                        } else {
                            salir = true;
                        }
                    }
                    default -> System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\n--- DATOS DEL FORMULARIO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Email: " + email);
    }
}
