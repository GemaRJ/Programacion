import java.io.*;
import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        String archivo = "C:\\Users\\GEMA\\IdeaProjects\\empleados.txt"; // Ruta absoluta del archivo

        ArrayList<Empleado> empleados = new ArrayList<>();

        // Mostrar ruta para depuración
        System.out.println("Ruta del archivo: " + archivo);
        System.out.println("Contenido del archivo:");

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");

                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    int edad = Integer.parseInt(partes[1].trim());
                    double salario = Double.parseDouble(partes[2].trim());

                    Empleado empleado = new Empleado(nombre, edad, salario);
                    empleados.add(empleado);
                }
            }

            // Mostrar empleados leídos
            System.out.println("\nEmpleados leídos:");
            for (Empleado e : empleados) {
                System.out.println(e);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        // Guardar en empleados.obj
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empleados.obj"))) {
            oos.writeObject(empleados);
            System.out.println("\n Fichero empleados.obj creado con éxito.");
        } catch (IOException e) {
            System.out.println(" Error al guardar empleados.obj: " + e.getMessage());
        }
    }
}
