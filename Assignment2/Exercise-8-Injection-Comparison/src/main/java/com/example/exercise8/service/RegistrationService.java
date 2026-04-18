package com.example.exercise8.service;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String register() {
        System.out.println("Setter Injection: register() method executed");
        return "Registration successful using Setter Injection";
    }
}
