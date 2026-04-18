package com.example.exercise8.controller;

import com.example.exercise8.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private RegistrationService registrationService;

    @Autowired
    public void setRegistrationService(RegistrationService registrationService) {
        this.registrationService = registrationService;
        System.out.println("Setter Injection: RegistrationService injected into Controller");
    }

    @GetMapping("/register")
    public String register() {
        return registrationService.register();
    }
}
