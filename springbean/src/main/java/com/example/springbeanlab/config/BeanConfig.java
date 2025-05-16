package com.example.springbeanlab.config;

// Importing the GreetingService class (the class we want to make a Bean)
import com.example.springbeanlab.service.GreetingService;

// Importing Spring annotations for configuration
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class that defines a Spring Bean.
 * This class is responsible for defining Spring-managed beans using @Bean methods.
 */
@Configuration 
// @Configuration - Indicates that this class is a Spring configuration class.
// Spring will automatically detect this class and use it to create Beans.
public class BeanConfig {

    /**
     * Defines a GreetingService Bean.
     * This method creates an instance of the GreetingService class and 
     * registers it as a Spring Bean in the ApplicationContext.
     * 
     * @return a new GreetingService instance with a preset greeting message
     */
    @Bean 
    // @Bean - Marks this method as a Bean provider.
    // The returned object will be managed by the Spring container (ApplicationContext).
    // The method name ("greetingService") becomes the Bean name by default.
    public GreetingService greetingService() {
        // Creating and returning a new GreetingService instance
        // The greeting message is set as "Hello, Spring Bean!"
        return new GreetingService("Hello, Spring Bean!");
    }
}

