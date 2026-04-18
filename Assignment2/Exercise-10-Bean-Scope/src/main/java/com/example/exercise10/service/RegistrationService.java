package com.example.exercise10.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") // each request creates a new object
public class RegistrationService {

    public RegistrationService() {
        System.out.println("RegistrationService object created (Prototype)");
    }

    public void process() {
        System.out.println("RegistrationService method called");
    }
}
