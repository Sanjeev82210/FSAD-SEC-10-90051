package com.example.exercise9.service;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String register() {
        System.out.println("RegistrationService bean created successfully");
        return "Registration successful after fixing DI error";
    }
}
