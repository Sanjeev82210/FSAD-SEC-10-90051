package com.klh.service;

import com.klh.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private final List<Course> courses = new ArrayList<>();

    public CourseService() {
        courses.add(new Course(3, "Java Programming", "3", 12000));
        courses.add(new Course(5, "Web Development", "6", 20000));
        courses.add(new Course(8, "FSAD", "4", 18000));
    }

    public Course addCourse(Course course) {
        courses.add(course);
        return course;
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course getCourseById(int id) {
        return courses.stream()
                .filter(course -> course.getCourseId() == id)
                .findFirst()
                .orElse(null);
    }

    public Course updateCourse(int id, Course newCourse) {
        Course existing = getCourseById(id);

        if (existing == null) {
            return null;
        }

        existing.setTitle(newCourse.getTitle());
        existing.setDuration(newCourse.getDuration());
        existing.setFee(newCourse.getFee());

        return existing;
    }

    public boolean deleteCourse(int id) {
        return courses.removeIf(course -> course.getCourseId() == id);
    }

    public List<Course> searchByTitle(String title) {
        List<Course> result = new ArrayList<>();

        for (Course course : courses) {
            if (course.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(course);
            }
        }

        return result;
    }
}