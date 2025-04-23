package Model;

public class Terror extends Libro {

    private String calificacion;

    // Constructor vacío
    public Terror() {
    }

    // Constructor con parámetros
    public Terror(String titulo, String autor, int numeroPaginas, int isbn, String categoria, String calificacion) {
        super(titulo, autor, numeroPaginas, isbn, "Terror");
        this.calificacion = calificacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();  // Llamar al método mostrarDatos de la clase base (Libro)
        System.out.println(" Calificación: " + calificacion);
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
