package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        if (student.getId() == 0) {
            student.setId(IdGenerator.getNextStudentId());
        }
        students.add(student);
        System.out.println("Student added : " + student.getDisplayName());
    }

    public void addStudent(String firstName, String lastName, String email, String batch) {
        int newId = IdGenerator.getNextStudentId();
        Student newStudent = new Student(newId, firstName, lastName, email, batch, true);
        students.add(newStudent);
        System.out.println("Student added : " + newStudent.getDisplayName());
    }

    public void listStudents() {
        System.out.println("--- Student List ---");
        if (students.isEmpty()) {
            System.out.println("No students added yet.");
        } else {
            for (Student student : students) {
                System.out.println(student.getId() + " | " + student.getFirstName() + " " + student.getLastName() + " | Batch: " + student.getBatch());
            }
        }
    }

    public Student getStudentById(int id) {
        return students.get(id);
    }

    public void deactivateStudent(int id) {
        getStudentById(id).setActive(false);
        System.out.println("Student with ID " + id + " has been deactivated.");
    }
}