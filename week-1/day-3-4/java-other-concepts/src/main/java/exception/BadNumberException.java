package exception;

public class BadNumberException extends RuntimeException{

    public BadNumberException() {
    }

    public BadNumberException(String message) {
        super(message);
    }
}
