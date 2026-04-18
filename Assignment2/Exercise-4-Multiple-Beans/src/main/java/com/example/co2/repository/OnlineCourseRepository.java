package com.example.co2.repository;

import org.springframework.stereotype.Repository;

@Repository("onlineRepo")
public class OnlineCourseRepository implements CourseRepository {

    @Override
    public void getCourseDetails() {
        System.out.println("Fetching course details from ONLINE repository");
    }
}
