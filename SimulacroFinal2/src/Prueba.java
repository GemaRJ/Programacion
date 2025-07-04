import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        // Crear lista de figuras
        ArrayList<Figura2D> figuras = new ArrayList<>();

        // Agregar figuras
        figuras.add(new Circulo("Círculo A", 5));
        figuras.add(new Rectangulo("Rectángulo B", 4, 6));
        figuras.add(new Triangulo("Triángulo C", 3, 4, 5));

        // Recorrer e imprimir nombre y perímetro
        for (Figura2D figura : figuras) {
            System.out.println(figura.toString());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("-----------------------------");
        }
    }
}
