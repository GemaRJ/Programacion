package Modelo;

public class Carrera {
    private Coche coche1;
    private Coche coche2;
    private double kmTotales;
    private int numeroVueltas;
    private String ganador;

    public Carrera(Coche coche1, Coche coche2, double kmTotales, int numeroVueltas) {
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.kmTotales = kmTotales;
        this.numeroVueltas = numeroVueltas;
        this.ganador = "";
    }

    public void iniciarCarrera() {
        // Mensaje de bienvenida a la carrera
        System.out.println("¡Bienvenidos a la Carrera de Coches!");
        System.out.println("Prepárense para vivir la emoción de la velocidad.");
        System.out.println("Los coches que compiten hoy son:");

        // Mostrar solo los datos generales de cada coche al inicio
        System.out.println("\nCoche 1 - Datos:");
        coche1.mostrarDatosGenerales();
        System.out.println("\nCoche 2 - Datos:");
        coche2.mostrarDatosGenerales();

        // Presentación del circuito
        System.out.println("\nLa carrera comenzará en el circuito de España.");
        System.out.println("Kilómetros totales a recorrer: " + kmTotales + " km");
        System.out.println("Número de vueltas: " + numeroVueltas + "\n");

        // Iniciar la carrera
        System.out.println("¡La carrera ha comenzado!");
        for (int vuelta = 1; vuelta <= numeroVueltas; vuelta++) {
            System.out.println("\nVuelta " + vuelta);

            // Acelerar los coches
            coche1.acelerar(30);
            coche2.acelerar(30);

            // Mostrar solo los datos relevantes (velocidad y kilómetros recorridos)
            System.out.println("\nEstado tras la Vuelta " + vuelta);
            System.out.println("Coche 1:");
            System.out.println("Velocidad: " + coche1.getVelocidad() + " km/h");
            System.out.println("Kilómetros recorridos: " + coche1.getKmRecorridos());
            System.out.println("Coche 2:");
            System.out.println("Velocidad: " + coche2.getVelocidad() + " km/h");
            System.out.println("Kilómetros recorridos: " + coche2.getKmRecorridos());

            // Comprobar si algún coche alcanzó la meta
            if (coche1.haAlcanzadoMeta(kmTotales)) {
                ganador = coche1.getMatricula();
                break;
            } else if (coche2.haAlcanzadoMeta(kmTotales)) {
                ganador = coche2.getMatricula();
                break;
            }
        }

        // Si no se alcanza la meta en las vueltas iniciales, se dan más vueltas extras
        if (ganador.isEmpty()) {
            while (ganador.isEmpty()) {
                coche1.acelerar(30);
                coche2.acelerar(30);

                System.out.println("\nEstado de los coches tras una vuelta extra");
                System.out.println("Coche 1:");
                System.out.println("Velocidad: " + coche1.getVelocidad() + " km/h");
                System.out.println("Kilómetros recorridos: " + coche1.getKmRecorridos());
                System.out.println("Coche 2:");
                System.out.println("Velocidad: " + coche2.getVelocidad() + " km/h");
                System.out.println("Kilómetros recorridos: " + coche2.getKmRecorridos());

                // Verificar si algún coche alcanza la meta
                if (coche1.haAlcanzadoMeta(kmTotales)) {
                    ganador = coche1.getMatricula();
                } else if (coche2.haAlcanzadoMeta(kmTotales)) {
                    ganador = coche2.getMatricula();
                }
            }
        }

        // Mensaje final con el ganador
        System.out.println("\nLa carrera ha terminado.");
        System.out.println("El ganador ha sido el coche con matrícula: " + ganador);
    }

    public void setKmTotales(double kmTotales) {
        this.kmTotales = kmTotales;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }
}
