package az.atlacademy.se.lesson13;

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }

}
