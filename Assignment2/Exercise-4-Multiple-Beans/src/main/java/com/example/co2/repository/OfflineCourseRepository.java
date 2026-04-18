package com.example.co2.repository;

import org.springframework.stereotype.Repository;

@Repository("offlineRepo")
public class OfflineCourseRepository implements CourseRepository {

    @Override
    public void getCourseDetails() {
        System.out.println("Fetching course details from OFFLINE repository");
    }
}
