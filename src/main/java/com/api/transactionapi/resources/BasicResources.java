package com.api.transactionapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicResources {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
