package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.util.IdGenerator;
import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(String name, String desc, int duration) {
        int id = IdGenerator.getNextCourseId();
        Course course = new Course(id, name, desc, duration, true);
        courses.add(course);
        System.out.println("Course added : " + name);
    }

    public void listCourses() {
        System.out.println("--- Course List ---");
        for (Course c : courses) {
            System.out.println(c.getId() + " | " + c.getCourseName() + " | Active: " + c.isActive());
        }
    }

    public void toggleActivation(int id) {
        for (Course c : courses) {
            if (c.getId() == id) {
                c.setActive(!c.isActive());
                System.out.println("Course status updated to: " + (c.isActive() ? "Active" : "Inactive"));
                return;
            }
        }
        throw new EntityNotFoundException("Course with id " + id + " does not exist.");
    }
}