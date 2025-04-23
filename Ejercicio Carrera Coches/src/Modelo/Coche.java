package Modelo;

import java.util.Random;

public class Coche {
    private String marca;
    private String modelo;
    private int cv;
    private int cc;
    private String matricula;
    private double velocidad;
    private double kmRecorridos;

    // Constructor
    public Coche(String marca, String modelo, int cv, int cc, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.cc = cc;
        this.matricula = matricula;
        this.velocidad = 0;
        this.kmRecorridos = 0;
    }

    // Método para acelerar el coche
    public void acelerar(int velocidadDeseada) {
        Random random = new Random();
        double incremento = 0;

        // Limitar la velocidad máxima a 300 km/h. Los coches me cogían mucha velocidad por cada vuelta y esta es la manera de controlarlos que he encontrado.
        velocidadDeseada = Math.min(velocidadDeseada, 300);

        if (cv < 100) {
            incremento = random.nextDouble() * velocidadDeseada;
        } else {
            incremento = (random.nextDouble() * velocidadDeseada) + 10;
        }

        // Incrementar la velocidad del coche
        velocidad += incremento;
        if (velocidad > 300) {
            velocidad = 300;  // Asegurarnos de que no sobrepase los 300 km/h
        }

        // Aumentar los km recorridos en función de la velocidad
        kmRecorridos += 0.5 * incremento;
    }

    // Verificar si el coche ha alcanzado la meta
    public boolean haAlcanzadoMeta(double kmTotales) {
        return kmRecorridos >= kmTotales;
    }

    // Mostrar datos generales del coche (solo al inicio)
    public void mostrarDatosGenerales() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("CV: " + cv);
        System.out.println("CC: " + cc);
        System.out.println("Matrícula: " + matricula);
    }

    // Métodos para obtener velocidad y kilómetros recorridos
    public double getVelocidad() {
        return velocidad;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public String getMatricula() {
        return matricula;
    }
}
