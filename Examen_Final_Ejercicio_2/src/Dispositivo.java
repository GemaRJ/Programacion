public class Dispositivo {

    private String marca;
    private String modelo;
    private int version;

    public Dispositivo() {}

    public Dispositivo(String marca, String modelo, int version) {
        this.marca = marca;
        this.modelo = modelo;
        this.version = version;
    }

    public void actualizarFirmware() {
        System.out.println("Actualizando firmware del dispositivo...");
        version++;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Versión: " + version;
    }
}
