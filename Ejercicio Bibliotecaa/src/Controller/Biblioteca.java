package Controller;

import Model.Libro;
import Excepcion.SinEspacioEnCatalogoException;
import Excepcion.LibroNoEncontradoException;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private String direccion;
    private int numero;
    private ArrayList<Libro> catalogo;
    private int capacidadMaxima;

    // Constructor con parámetros
    public Biblioteca(String nombre, String direccion, int numero, int capacidadMaxima) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
        this.catalogo = new ArrayList<>();
        this.capacidadMaxima = capacidadMaxima;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion + ", " + numero + ".");
        System.out.println("Número de libros en catálogo: " + catalogo.size());
        System.out.println("Capacidad máxima: " + capacidadMaxima);
    }

    public void agregarLibro(Libro libro) throws SinEspacioEnCatalogoException {
        if (catalogo.size() >= capacidadMaxima) {
            throw new SinEspacioEnCatalogoException("No hay suficiente espacio para agregar el libro.");
        }
        catalogo.add(libro);
        System.out.println("Libro agregado con éxito.");
    }

    public void eliminarLibro(int isbn) throws LibroNoEncontradoException {
        boolean encontrado = false;
        for (Libro libro : catalogo) {
            if (libro.getIsbn() == isbn) {
                catalogo.remove(libro);
                System.out.println("Libro con ISBN " + isbn + " eliminado.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new LibroNoEncontradoException("No se encontró el libro con el ISBN: " + isbn);
        }
    }

    public void buscarLibro(int isbn) throws LibroNoEncontradoException {
        for (Libro libro : catalogo) {
            if (libro.getIsbn() == isbn) {
                libro.mostrarDatos();
                return;
            }
        }
        throw new LibroNoEncontradoException("No se encontró el libro con el ISBN: " + isbn);
    }

    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            for (Libro libro : catalogo) {
                libro.mostrarDatos();
                System.out.println("--------------");
            }
        }
    }
}
