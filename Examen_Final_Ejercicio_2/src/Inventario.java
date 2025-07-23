import java.util.ArrayList;

public class Inventario {


    public static void main(String[] args) {
        ArrayList<Dispositivo> lista = new ArrayList<>();

        // Crear dispositivos
        Smartphone s1 = new Smartphone("Samsung", "Galaxy S21", 1, 3);
        Smartphone s2 = new Smartphone("Apple", "iPhone 14", 2, 2);
        Portatil p1 = new Portatil("Lenovo", "ThinkPad", 1, 10);
        Portatil p2 = new Portatil("HP", "Pavilion", 2, 8);

        // Añadir al arraylist
        lista.add(s1);
        lista.add(s2);
        lista.add(p1);
        lista.add(p2);

        // Actualizar firmware de todos
        for (Dispositivo d : lista) {
            d.actualizarFirmware();
        }

        System.out.println("\n=== Información de los dispositivos ===");
        for (Dispositivo d : lista) {
            System.out.println(d);
        }
    }
}
