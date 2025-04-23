package Excepcion;

public class SinEspacioEnCatalogoException extends Exception {
    // Constructor por defecto
    public SinEspacioEnCatalogoException() {
        super("No hay espacio disponible en el catálogo para agregar más libros.");
    }

    // Constructor que acepta un mensaje personalizado
    public SinEspacioEnCatalogoException(String mensaje) {
        super(mensaje);
    }
}
