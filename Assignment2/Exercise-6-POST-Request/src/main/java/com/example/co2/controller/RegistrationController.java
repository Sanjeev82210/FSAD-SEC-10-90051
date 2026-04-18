package com.example.co2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showForm() {
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(
            @RequestParam("studentName") String studentName,
            @RequestParam("courseName") String courseName,
            Model model) {

        model.addAttribute("studentName", studentName);
        model.addAttribute("courseName", courseName);
        return "result";
    }
}
