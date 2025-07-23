public class Portatil extends Dispositivo {

    private int autonomia;

    public Portatil() {}

    public Portatil(String marca, String modelo, int version, int autonomia) {
        super(marca, modelo, version);
        this.autonomia = autonomia;
    }

    @Override
    public void actualizarFirmware() {
        super.actualizarFirmware();
        System.out.println("Actualizando BIOS y controladores...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Autonomía: " + autonomia + " horas";
    }
}
