package Excepcion; // Asegúrate de que el paquete sea correcto

public class LibroNoEncontradoException extends Exception {
    // Constructor por defecto
    public LibroNoEncontradoException() {
        super("No se encontró un libro con el ISBN proporcionado.");
    }

    // Constructor con mensaje personalizado
    public LibroNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}
