package Excepciones;

public class LongitudDNINoValidaException extends Exception {
  public LongitudDNINoValidaException() {
    super("El DNI debe tener exactamente 9 caracteres.");
  }
}
