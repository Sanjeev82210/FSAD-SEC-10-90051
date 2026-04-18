package com.example.exercise10.controller;

import com.example.exercise10.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/test")
    public String testScope() {
        registrationService.process();
        registrationService.process();
        registrationService.process();
        return "Check console for bean scope behavior";
    }
}
