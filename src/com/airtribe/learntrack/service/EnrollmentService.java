package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {
    private List<Enrollment> enrollments = new ArrayList<>();
    private int enrollmentCounter = 1;

    public void enroll(String studentId, String courseId) {
        String eId = "ENR" + (enrollmentCounter++);
        Enrollment enrollment = new Enrollment(eId, studentId, courseId, LocalDate.now(), "ACTIVE");
        enrollments.add(enrollment);
        System.out.println("Enrollment successful. ID: " + eId);
    }

    public void viewEnrollments(String studentId) {
        System.out.println("--- Enrollments for Student " + studentId + " ---");
        for (Enrollment e : enrollments) {
            if (e.getStudentId().equals(studentId)) {
                System.out.println(e.getId() + " | Course: " + e.getCourseId() + " | Status: " + e.getStatus());
            }
        }
    }

    public void updateStatus(String enrollmentId, String status) {
        for (Enrollment e : enrollments) {
            if (e.getId().equals(enrollmentId)) {
                e.setStatus(status);
                System.out.println("Enrollment status updated to: " + status);
                return;
            }
        }
        System.out.println("Enrollment not found.");
    }
}