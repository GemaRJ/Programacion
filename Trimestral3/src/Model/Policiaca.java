package Model;

public class Policiaca extends Libro {

    private String Trama;
    private String Personaje;

    // Constructor vacío
    public Policiaca() {
    }

    public Policiaca(String titulo, String autor, int numeroPaginas, int isbn, String categoria, String trama, String personaje) {
        super(titulo, autor, numeroPaginas, isbn, "Policiaca");
        Trama = trama;
        Personaje = personaje;
    }

    public String getTrama() {
        return Trama;
    }

    public void setTrama(String trama) {
        Trama = trama;
    }

    public String getPersonaje() {
        return Personaje;
    }

    public void setPersonaje(String personaje) {
        Personaje = personaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Trama: " + Trama);
        System.out.println("Personaje: " + Personaje);
    }
}
