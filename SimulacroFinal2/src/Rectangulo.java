public class Rectangulo extends Figura2D {

    private double base;
    private double altura;

    // Constructor
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);  // Llama al constructor de Figura2D
        this.base = base;
        this.altura = altura;
    }

    // Getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + " | Base: " + base + " | Altura: " + altura;
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangulo rectangulo = (Rectangulo) obj;
        return Double.compare(rectangulo.base, base) == 0 &&
                Double.compare(rectangulo.altura, altura) == 0 &&
                nombre.equals(rectangulo.nombre);
    }

    // Método para calcular el perímetro
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
