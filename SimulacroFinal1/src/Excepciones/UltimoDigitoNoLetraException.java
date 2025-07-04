package Excepciones;

public class UltimoDigitoNoLetraException extends Exception {
    public UltimoDigitoNoLetraException() {
        super("El último carácter del DNI debe ser una letra.");
    }
}
