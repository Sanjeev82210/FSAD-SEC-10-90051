package com.example.exercise7.service;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String register() {
        System.out.println("RegistrationService: register() method executed");
        return "User Registered Successfully";
    }
}
