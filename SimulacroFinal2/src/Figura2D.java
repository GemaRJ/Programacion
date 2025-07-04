public abstract class Figura2D implements FiguraGeometrica {
    protected String nombre;

    // Constructor
    public Figura2D(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString para mostrar el nombre
    @Override
    public String toString() {
        return "Figura: " + nombre;
    }
}
