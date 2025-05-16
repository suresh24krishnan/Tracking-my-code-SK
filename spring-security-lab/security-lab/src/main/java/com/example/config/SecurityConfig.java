package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Configures Spring Security for authentication and authorization.
 */
@Configuration 
// @Configuration - Declares this class as a Spring configuration class.
// It means that Spring will use this class to define and configure beans for the application.

@EnableWebSecurity 
// @EnableWebSecurity - Enables Spring Security for the application.
// This allows the application to use security configurations like authentication and authorization.

@EnableGlobalMethodSecurity(prePostEnabled = true)
// @EnableGlobalMethodSecurity - Enables method-level security using annotations (like @PreAuthorize).
// prePostEnabled = true means that you can use @PreAuthorize and @PostAuthorize annotations 
// directly on your service methods to control access.
public class SecurityConfig {

    /**
     * Configures in-memory authentication with users and roles.
     * @return the user details service
     */
    @Bean 
    // @Bean - Marks this method as a bean provider. Spring will automatically create and manage
    // this object (UserDetailsService) in the ApplicationContext.
    public UserDetailsService userDetailsService() {
        // InMemoryUserDetailsManager - Provides an in-memory authentication manager.
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        
        // Creating an in-memory user with username "user" and role "USER"
        manager.createUser(User.withUsername("user")
                .password("{noop}user") // {noop} means plain text password (no encryption)
                .roles("USER")         // Assigning the role "USER" to this user
                .build());
        
        // Creating another in-memory user with username "admin" and role "ADMIN"
        manager.createUser(User.withUsername("admin")
                .password("{noop}admin") // Plain text password for "admin"
                .roles("ADMIN")          // Assigning the role "ADMIN" to this user
                .build());
        
        // Returning the UserDetailsService bean
        return manager;
    }

    /**
     * Configures HTTP security (disabled for CLI testing).
     * @param http the HTTP security configuration
     * @return the security filter chain
     * @throws Exception if configuration fails
     */
    @Bean 
    // @Bean - Marks this method as a bean provider. Spring will automatically create and manage
    // this object (SecurityFilterChain) in the ApplicationContext.
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests() // Defines the authorization rules for HTTP requests
            .anyRequest().permitAll() // Allows all requests without authentication (for testing only)
            .and()
            .csrf().disable(); // Disables CSRF protection (not recommended for production)
        
        // Builds and returns the security filter chain
        return http.build();
    }
}

