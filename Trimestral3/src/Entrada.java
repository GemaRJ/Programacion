import Model.Terror;
import Model.Comedia;
import Model.Policiaca;
import Controller.Biblioteca;
import Excepcion.SinEspacioEnCatalogoException;
import Excepcion.LibroNoEncontradoException;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        // Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal de Alcorcón", "Av. de Leganés", 31, 100);

        // He creado los libros desde el inicio y luego se pueden crear también
        Terror terror = new Terror("IT", "Stephen King", 100, 1234, "terror", "Alto");
        Comedia comedia = new Comedia("Rebelión en la granja", "George Orwell", 200, 3456, "Comedia", "Divertida");
        Policiaca policiaca = new Policiaca("Las aventuras de Sherlock Holmes", "Arthur Connan Doyle", 500, 7891, "Policiaca", "Investigación de un crimen", "Sherlock Holmes");



        // Bienvenida al principio
        System.out.println("Bienvenidos a la Biblioteca:");

        // Para que el menú se muestre de nuevo al pulsar una opción
        while (true) {
            biblioteca.mostrarDatos(); // Aquí mostrará el número de libros correctamente
            System.out.println("              ");
            System.out.println("¿Qué quieres hacer en la Biblioteca?");
            System.out.println("1- Agregar Libro");
            System.out.println("2- Eliminar Libro");
            System.out.println("3- Buscar Libro");
            System.out.println("4- Mostrar todos los Libros");
            System.out.println("5- Salir");

            Scanner teclado = new Scanner(System.in);
            int opcion = teclado.nextInt();
            teclado.nextLine();

            if (opcion == 5) {
                System.out.println("Saliendo de la biblioteca. ¡¡¡ Hasta pronto !!!");
                break;
            }

            if (opcion >= 1 && opcion <= 4) {
                switch (opcion) {
                    case 1:
                        System.out.println("Agregando Libro...");

                        // Pedir los datos básicos del libro para agregarlos
                        System.out.print("Introduce el título del libro: ");
                        String titulo = teclado.nextLine();

                        System.out.print("Introduce el autor del libro: ");
                        String autor = teclado.nextLine();

                        System.out.print("Introduce el número de páginas: ");
                        int numeroPaginas = teclado.nextInt();

                        System.out.print("Introduce el ISBN: ");
                        int isbn = teclado.nextInt();
                        teclado.nextLine(); // Limpia el buffer después de nextInt()

                        System.out.print("Introduce la categoría (por ejemplo: 'Terror', 'Comedia', 'Policiaca'): ");
                        String categoria = teclado.nextLine().trim();

                        String calificacion = "";
                        String tipoDeHumor = "";
                        String trama = "";
                        String personaje = "";

                        try {
                            // Dependiendo de la categoría, crea el libro correspondiente
                            if (categoria.equalsIgnoreCase("Terror")) {
                                System.out.print("Introduce la calificación (por ejemplo: 'Alto', 'Bajo', etc.): ");
                                calificacion = teclado.nextLine();
                                Terror nuevoTerror = new Terror(titulo, autor, numeroPaginas, isbn, categoria, calificacion);
                                biblioteca.agregarLibro(nuevoTerror);
                            } else if (categoria.equalsIgnoreCase("Comedia")) {
                                System.out.print("Introduce el tipo de humor (por ejemplo: 'Divertido', 'Irónico', etc.): ");
                                tipoDeHumor = teclado.nextLine();
                                Comedia nuevoComedia = new Comedia(titulo, autor, numeroPaginas, isbn, categoria, tipoDeHumor);
                                biblioteca.agregarLibro(nuevoComedia);
                            } else if (categoria.equalsIgnoreCase("Policiaca")) {
                                System.out.print("Introduce la trama (por ejemplo: 'Investigación de un crimen'): ");
                                trama = teclado.nextLine();

                                System.out.print("Introduce el personaje principal (por ejemplo: 'Detective Sherlock Holmes'): ");
                                personaje = teclado.nextLine();

                                Policiaca nuevoPoliciaca = new Policiaca(titulo, autor, numeroPaginas, isbn, categoria, trama, personaje);
                                biblioteca.agregarLibro(nuevoPoliciaca);
                            } else {
                                System.out.println("Categoría no válida.");
                            }
                        } catch (SinEspacioEnCatalogoException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.println("Eliminando Libro...");
                        System.out.print("Introduce el ISBN del libro a eliminar: ");
                        int isbnEliminar = teclado.nextInt();
                        try {
                            biblioteca.eliminarLibro(isbnEliminar);
                        } catch (LibroNoEncontradoException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        System.out.println("Buscando un Libro...");
                        System.out.print("Introduce el ISBN del libro a buscar: ");
                        int isbnBuscar = teclado.nextInt();
                        try {
                            biblioteca.buscarLibro(isbnBuscar);
                        } catch (LibroNoEncontradoException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 4:
                        System.out.println("Mostrar todos los Libros de mi Biblioteca: ");
                        biblioteca.mostrarCatalogo();  // Muestra los libros
                        break;

                    default:
                        System.out.println("Opción no válida. Introduzca otra opción.");
                }
            } else {
                System.out.println("Opción no válida. Introduzca otra opción:");
            }
        }
    }
}
