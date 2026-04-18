package com.example.co2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.co2.repository.CourseRepository;

@Service
public class RegistrationService {

    @Autowired
    private CourseRepository courseRepository;

    public void registerCourse() {
        System.out.println("Registering course using @Autowired...");
        courseRepository.getCourseDetails();
    }
}
