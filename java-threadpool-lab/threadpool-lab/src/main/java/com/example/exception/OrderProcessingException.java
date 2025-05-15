package com.example.exception;

/**
 * Custom exception for order processing errors.
 */
public class OrderProcessingException extends Exception {
    /**
     * Constructs an OrderProcessingException with the given message.
     * @param message the error message
     */
    public OrderProcessingException(String message) {
        super(message);
    }
}

