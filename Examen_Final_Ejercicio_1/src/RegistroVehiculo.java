import java.util.Scanner;

public class RegistroVehiculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FormularioVehiculo formulario = new FormularioVehiculo();
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ REGISTRO VEHÍCULO ---");
            System.out.println("1. Introducir matrícula");
            System.out.println("2. Introducir marca");
            System.out.println("3. Introducir año de matriculación");
            System.out.println("4. Finalizar");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce matrícula (ej. 1234ABC): ");
                        String matricula = scanner.nextLine();
                        formulario.setMatricula(matricula);
                        break;
                    case 2:
                        System.out.print("Introduce marca: ");
                        String marca = scanner.nextLine();
                        formulario.setMarca(marca);
                        break;
                    case 3:
                        System.out.print("Introduce año de matriculación: ");
                        int anio = Integer.parseInt(scanner.nextLine());
                        formulario.setAnio(anio);
                        break;
                    case 4:
                        if (formulario.estaCompleto()) {
                            System.out.println(" Registro finalizado con éxito.");
                        } else {
                            System.out.println(" Faltan datos por completar:");
                            if (formulario.getMatricula() == null) System.out.println("- Matrícula");
                            if (formulario.getMarca() == null) System.out.println("- Marca");
                            if (formulario.getAnio() == 0) System.out.println("- Año de matriculación");
                            opcion = 0; // Para que no salga del menú
                        }
                        break;
                    default:
                        System.out.println(" Opción no válida.");
                }

            } catch (NumberFormatException e) {
                System.out.println(" Debes introducir un número válido.");
            } catch (LongitudMatriculaNoValidaException | FormatoMatriculaNoValidoException e) {
                System.out.println(" Error: " + e.getMessage());
            }

        } while (opcion != 4);

        scanner.close();
    }
}