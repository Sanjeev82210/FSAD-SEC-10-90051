package com.example.co2.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

    public void getCourseDetails() {
        System.out.println("Fetching course details from CourseRepository");
    }
}
