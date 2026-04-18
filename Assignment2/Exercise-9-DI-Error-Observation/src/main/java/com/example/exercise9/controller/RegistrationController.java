package com.example.exercise9.controller;

import com.example.exercise9.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService; // ❌ NO bean exists yet

    @GetMapping("/register")
    public String register() {
        return registrationService.register();
    }
}
