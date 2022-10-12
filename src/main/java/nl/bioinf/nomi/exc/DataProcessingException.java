package nl.bioinf.nomi.exc;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message) {
        //this() calls another constructor of this same instance
        this(message, null);
    }

    public DataProcessingException(String message, Throwable cause) {
        //super() calls the constructor of the super class
        super(message, cause);
    }
}
