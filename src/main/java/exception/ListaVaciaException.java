package exception;

public class ListaVaciaException extends RuntimeException{
    public ListaVaciaException() {
    }

    public ListaVaciaException(String message) {
        super(message);
    }
}
