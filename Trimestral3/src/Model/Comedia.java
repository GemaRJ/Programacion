package Model;

public class Comedia extends Libro {

    private String TipoDeHumor;

    // Constructor vacío
    public Comedia() {
    }

    // Constructor con parámetros
    public Comedia(String titulo, String autor, int numeroPaginas, int isbn, String categoria, String tipoDeHumor) {
        super(titulo, autor, numeroPaginas, isbn, "Comedia");
        this.TipoDeHumor = tipoDeHumor;  // Usar 'this' para hacer referencia a la variable de instancia
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de humor: " + TipoDeHumor);
    }

    public String getTipoDeHumor() {
        return TipoDeHumor;
    }

    public void setTipoDeHumor(String tipoDeHumor) {
        this.TipoDeHumor = tipoDeHumor;  // Usar 'this' para hacer referencia a la variable de instancia
    }
}
