package com.example.co2.service;

import com.example.co2.repository.CourseRepository;

public class RegistrationService {

    private CourseRepository courseRepository;

    // Setter Injection
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
        System.out.println("CourseRepository injected using setter");
    }

    public void registerCourse() {
        System.out.println("Registering course...");
        courseRepository.getCourseDetails();
    }
}
