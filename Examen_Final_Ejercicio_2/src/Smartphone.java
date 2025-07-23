public class Smartphone extends Dispositivo {

    private int camaras;

    public Smartphone() {}

    public Smartphone(String marca, String modelo, int version, int camaras) {
        super(marca, modelo, version);
        this.camaras = camaras;
    }

    @Override
    public void actualizarFirmware() {
        super.actualizarFirmware();
        System.out.println("Actualizando sistema operativo Android/iOS...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Cámaras: " + camaras;
    }
}
