package com.example.simpleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/greeting")
    public String getGreeting() {
        return "Hello from your Simple Spring Boot API!";
    }

    @GetMapping("/echo/{message}")
    public String echoMessage(@PathVariable String message) {
        return "You said: " + message;
    }
}

