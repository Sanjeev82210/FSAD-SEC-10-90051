package com.example.controller;

import com.example.exception.InvalidInputException;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable String id) {

        if (!id.matches("\\d+")) {
            throw new InvalidInputException("Student ID must be numeric");
        }

        int studentId = Integer.parseInt(id);
        return service.getStudentById(studentId);
    }
}
