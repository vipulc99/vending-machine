package com.example.vending.exception;

public class NotFullPaidException extends RuntimeException{
    /**
     * Constructs a new com.example.vending.exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public NotFullPaidException(String message) {
        super(message);
    }
}
