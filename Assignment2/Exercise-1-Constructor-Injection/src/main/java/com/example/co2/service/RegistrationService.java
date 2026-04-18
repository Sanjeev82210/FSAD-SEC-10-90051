package com.example.co2.service;

import com.example.co2.repository.CourseRepository;

public class RegistrationService {

    private CourseRepository courseRepository;

    // Constructor Injection
    public RegistrationService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
        System.out.println("RegistrationService constructor called");
    }

    public void registerCourse() {
        System.out.println("Registering course...");
        courseRepository.getCourseDetails();
    }
}
