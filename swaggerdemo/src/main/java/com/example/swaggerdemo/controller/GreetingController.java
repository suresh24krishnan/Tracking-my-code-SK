package com.example.swaggerdemo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Operation(
        summary = "Greet the user by name",
        description = "Returns a personalized greeting message for the provided name.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful greeting message"),
            @ApiResponse(responseCode = "400", description = "Missing or invalid name parameter")
        }
    )
    @GetMapping("/greet")
    public String greetUser(
        @Parameter(description = "Name of the user to greet", required = true)
        @RequestParam String name
    ) {
        return "Hello, " + name + "!";
    }
}

