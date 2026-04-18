package com.example.co2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    // when project root opens
    @GetMapping("/")
    public String home() {
        return "redirect:/register";
    }

    // actual GET request
    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register";
    }
}
//http://localhost:8080/Exercise-5-GET-Request/register