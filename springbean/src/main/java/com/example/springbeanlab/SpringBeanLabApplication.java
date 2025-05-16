package com.example.springbeanlab;

// Importing the GreetingService (a custom service class defined elsewhere in the project)
import com.example.springbeanlab.service.GreetingService;

// Importing Spring dependencies
import org.springframework.beans.factory.annotation.Autowired; // Used for dependency injection
import org.springframework.boot.CommandLineRunner;          // Allows running code after the application starts
import org.springframework.boot.SpringApplication;         // Bootstraps and launches the Spring Boot application
import org.springframework.boot.autoconfigure.SpringBootApplication; // Enables Spring Boot auto-configuration

/**
 * Main application class that demonstrates Spring Bean usage.
 * This class serves as the entry point for the Spring Boot application.
 */
@SpringBootApplication 
// @SpringBootApplication is a convenience annotation that combines:
// - @Configuration: Marks this class as a source of Spring Beans (configuration).
// - @EnableAutoConfiguration: Automatically configures Spring Boot based on dependencies.
// - @ComponentScan: Scans the package and sub-packages for Spring components.
public class SpringBeanLabApplication implements CommandLineRunner {
    
    // Declaring a GreetingService field (the Bean to be injected)
    private final GreetingService greetingService;

    /**
     * Constructor-based injection of the GreetingService Bean.
     * This approach is recommended for dependency injection because it ensures 
     * that the GreetingService is injected when the class is created.
     * 
     * @param greetingService the GreetingService Bean provided by Spring
     */
    @Autowired 
    // @Autowired - Automatically injects the GreetingService Bean into this class.
    // This is known as Dependency Injection (DI).
    public SpringBeanLabApplication(GreetingService greetingService) {
        this.greetingService = greetingService; // Assigning the injected bean to the class field
    }

    /**
     * The main method - Entry point of the Spring Boot application.
     * 
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Launches the Spring Boot application
        // The SpringApplication.run method:
        // 1. Starts the Spring ApplicationContext (container).
        // 2. Scans for Spring components (Beans).
        // 3. Auto-configures the application based on dependencies.
        // 4. Runs any CommandLineRunner beans (like this class).
        SpringApplication.run(SpringBeanLabApplication.class, args);
    }

    /**
     * Overriding the run method from CommandLineRunner.
     * This method is executed automatically after the application starts.
     * It demonstrates the use of the GreetingService Bean.
     * 
     * @param args Command-line arguments passed to the application
     */
    @Override
    public void run(String... args) {
        // Using the greetingService bean (Injected via constructor)
        // Calling the getGreeting() method on the GreetingService Bean
        // This prints the greeting message to the console.
        System.out.println(greetingService.getGreeting());
    }
}













