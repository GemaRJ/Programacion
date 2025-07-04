public class Circulo extends Figura2D {
    private double radio;

    // Constructor
    public Circulo(String nombre, double radio) {
        super(nombre);  // Llama al constructor de Figura2D
        this.radio = radio;
    }

    // Getter y setter para el radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + " | Radio: " + radio;
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circulo circulo = (Circulo) obj;
        return Double.compare(circulo.radio, radio) == 0 && nombre.equals(circulo.nombre);
    }

    // Método para calcular el perímetro
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
