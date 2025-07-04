package Excepciones;

public class NumeracionContieneLetrasException extends Exception {
  public NumeracionContieneLetrasException() {
    super("Los primeros 8 dígitos del DNI deben ser numéricos.");
  }
}

