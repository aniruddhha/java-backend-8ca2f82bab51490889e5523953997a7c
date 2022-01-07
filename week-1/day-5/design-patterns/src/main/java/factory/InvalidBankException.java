package factory;

public class InvalidBankException extends RuntimeException{

    public InvalidBankException(String message) {
        super(message);
    }
}
