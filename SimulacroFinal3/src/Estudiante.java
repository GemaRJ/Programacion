import java.io.*;
import java.util.ArrayList;

public class Estudiante {
    String nombre;
    int edad;
    double nota1, nota2, nota3;

    // Constructor
    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Método para calcular la media
    public double calcularNotaMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Nota Media: " + calcularNotaMedia();
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante estudiante = (Estudiante) obj;
        return edad == estudiante.edad &&
                Double.compare(estudiante.nota1, nota1) == 0 &&
                Double.compare(estudiante.nota2, nota2) == 0 &&
                Double.compare(estudiante.nota3, nota3) == 0 &&
                nombre.equals(estudiante.nombre);
    }

    // Método estático para leer estudiantes desde un archivo
    public static ArrayList<Estudiante> leerEstudiantes(String nombreFichero) throws IOException {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");
            String nombre = datos[0];
            int edad = Integer.parseInt(datos[1]);
            double nota1 = Double.parseDouble(datos[2]);
            double nota2 = Double.parseDouble(datos[3]);
            double nota3 = Double.parseDouble(datos[4]);

            Estudiante estudiante = new Estudiante(nombre, edad, nota1, nota2, nota3);
            listaEstudiantes.add(estudiante);
        }
        br.close();
        return listaEstudiantes;
    }

    public static void main(String[] args) {
        System.out.println("\nEstudiantes leídos desde el archivo:");
        // Crear lista de estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", 27, 3.2, 5.6, 8.3));
        estudiantes.add(new Estudiante("Ana", 35, 7.4, 6.5, 9.0));

        // Mostrar estudiantes
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        // Leer estudiantes desde archivo
        try {
            ArrayList<Estudiante> estudiantesLeidos = Estudiante.leerEstudiantes("src/Fichero/estudiantes.txt");
            for (Estudiante estudiante : estudiantesLeidos) {
                System.out.println(estudiante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
