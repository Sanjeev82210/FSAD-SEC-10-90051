package com.example.demo;

import com.klhb.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot! " + greetingService.getMessage();
    }

    @GetMapping("/hello")
    public String hello() {
        return greetingService.getMessage();
    }
}
