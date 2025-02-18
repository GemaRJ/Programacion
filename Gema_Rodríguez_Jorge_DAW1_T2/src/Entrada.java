// Se importa la clase Coche que se encuentra en el paquete Modelo
import Modelo.Coche;

// Se importa la clase Carrera que también se encuentra en el paquete Modelo
import Modelo.Carrera;

public class Entrada {

    // Método principal donde se ejecuta la aplicación
    public static void main(String[] args) {

        // Se crea el primer coche (coche1) con los parámetros:
        Coche coche1 = new Coche("Mercedes", "Clase E", 170, 2200, "1234ABC");

        // Se crea el segundo coche (coche2) con los parámetros:
        Coche coche2 = new Coche("Volkswaguen", "Polo", 105, 1600, "5678DFG");

        // Se crea la carrera, asociando los dos coches creados (coche1 y coche2),
        // Circuito tiene un total de 300 km a recorrer y se realizarán 5 vueltas. Para limitarlo.
        Carrera carrera = new Carrera(coche1, coche2, 100, 5);

        // Se inicia la carrera. Este método hace todo el proceso de simular la carrera
        // y muestra solo la información en consola que solo quiero mostrar ( velocidad de los coches y los kilómetros recorridos).
        carrera.iniciarCarrera();
    }
}
