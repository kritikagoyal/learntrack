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
        System.out.println("Student added: " + newStudent.getFirstName());
    }

    public void removeStudent(Student student) {
        students.remove(student);
        System.out.println("Student removed : " + student.getDisplayName());
    }

    public void updateStudent(Student student, int id, String email) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setEmail(email);
                System.out.println("Student's email ID updated");
            }
        }
    }

    public void listStudents() {
        for (Student s : students) {
            System.out.println(s.getId() + " | " + s.getDisplayName() + " | Batch : " + s.getBatch());
        }
    }
}