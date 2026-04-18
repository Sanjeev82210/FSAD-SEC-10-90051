package com.example.exercise7.controller;

import com.example.exercise7.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/register")
    public String register() {
        System.out.println("RegistrationController: register() called");
        return registrationService.register();
    }
}
