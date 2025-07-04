package Excepciones;

public class TipoDatoIncorrectoException extends Exception {
  public TipoDatoIncorrectoException() {
    super("Solo se permiten letras.");
  }
}
