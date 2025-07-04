package Excepciones;

public class EmailIncorrectoException extends Exception {
    public EmailIncorrectoException() {
        super("El email debe contener '@' y '.'");
    }
}