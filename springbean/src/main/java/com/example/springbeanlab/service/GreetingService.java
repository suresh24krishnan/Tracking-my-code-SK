package com.example.springbeanlab.service;

/**
 * Simple service class representing a Spring Bean.
 * This class is designed to provide a greeting message.
 * It is a plain Java class (POJO), but it can become a Spring Bean 
 * when registered using a configuration class or an annotation.
 */
public class GreetingService {
    
    // A private field that stores the greeting message.
    // This message is set when the object is created (constructor injection).
    private final String message;

    /**
     * Constructs a GreetingService with a message.
     * This is a constructor method, which is used to create an instance of the class.
     * 
     * @param message the greeting message
     */
    public GreetingService(String message) {
        // Assigning the provided message to the class field (final, so it cannot change)
        this.message = message;
    }

    /**
     * Provides the greeting message.
     * This is a getter method that returns the greeting message stored in this class.
     * Since the message is set in the constructor and is final, it cannot be changed.
     * 
     * @return the greeting message
     */
    public String getGreeting() {
        // Returning the greeting message stored in the message field
        return message;
    }
}

