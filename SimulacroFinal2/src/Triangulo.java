public class Triangulo extends Figura2D {

    private double lado1, lado2, lado3;

    // Constructor
    public Triangulo(String nombre, double lado1, double lado2, double lado3) {
        super(nombre);  // Llama al constructor de Figura2D
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Getters y setters
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + " | Lado1: " + lado1 + " | Lado2: " + lado2 + " | Lado3: " + lado3;
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangulo triangulo = (Triangulo) obj;
        return Double.compare(triangulo.lado1, lado1) == 0 &&
                Double.compare(triangulo.lado2, lado2) == 0 &&
                Double.compare(triangulo.lado3, lado3) == 0 &&
                nombre.equals(triangulo.nombre);
    }

    // Método para calcular el perímetro
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
