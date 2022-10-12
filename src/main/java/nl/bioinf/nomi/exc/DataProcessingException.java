package nl.bioinf.nomi.exc;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String divide_by_zero) {
        super(divide_by_zero);
    }

    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
