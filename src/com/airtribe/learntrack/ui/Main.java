package com.airtribe.learntrack.ui;

import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.service.CourseService;
import com.airtribe.learntrack.service.EnrollmentService;
import com.airtribe.learntrack.service.StudentService;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentService studentService = new StudentService();
    private static final CourseService courseService = new CourseService();
    private static final EnrollmentService enrollmentService = new EnrollmentService();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n=== LearnTrack Main Menu ===");
            System.out.println("1. Student Management");
            System.out.println("2. Course Management");
            System.out.println("3. Enrollment Management");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    studentMenu();
                    break;
                case "2":
                    courseMenu();
                    break;
                case "3":
                    enrollmentMenu();
                    break;
                case "0":
                    running = false;
                    System.out.println("Exiting LearnTrack. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void studentMenu() {
        System.out.println("\n--- Student Management ---");
        System.out.println("1. Add new student");
        System.out.println("2. View all students");
        System.out.println("3. Search student by ID");
        System.out.println("4. Deactivate a student");
        System.out.print("Select: ");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.print("First Name: ");
                String fname = scanner.nextLine();
                System.out.print("Last Name: ");
                String lname = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Batch: ");
                String batch = scanner.nextLine();
                studentService.addStudent(fname, lname, email, batch);
                break;
            case "2":
                studentService.listStudents();
                break;
            case "3":
                System.out.print("Enter Student ID: ");
                studentService.getStudentById(Integer.parseInt(scanner.nextLine()));
                break;
            case "4":
                System.out.print("Enter Student ID to deactivate: ");
                studentService.deactivateStudent(Integer.parseInt(scanner.nextLine()));
                break;
            default:
                System.out.println("Invalid input.");
        }
    }

    private static void courseMenu() {
        System.out.println("\n--- Course Management ---");
        System.out.println("1. Add new course");
        System.out.println("2. View all courses");
        System.out.println("3. Toggle course activation");
        System.out.print("Select: ");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.print("Course Name: ");
                String name = scanner.nextLine();
                System.out.print("Description: ");
                String desc = scanner.nextLine();
                System.out.print("Duration (weeks): ");
                try {
                    int duration = Integer.parseInt(scanner.nextLine());
                    courseService.addCourse(name, desc, duration);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid duration. Must be a number.");
                }
                break;
            case "2":
                courseService.listCourses();
                break;
            case "3":
                System.out.print("Enter Course ID: ");
                try {
                    int id = Integer.parseInt(scanner.nextLine());
                    courseService.toggleActivation(id);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. ID must be a number.");
                } catch (EntityNotFoundException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid input.");
        }
    }

    private static void enrollmentMenu() {
        System.out.println("\n--- Enrollment Management ---");
        System.out.println("1. Enroll student in course");
        System.out.println("2. View student enrollments");
        System.out.println("3. Update enrollment status");
        System.out.print("Select: ");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.print("Student ID: ");
                String sId = scanner.nextLine();
                System.out.print("Course ID: ");
                String cId = scanner.nextLine();
                enrollmentService.enroll(sId, cId);
                break;
            case "2":
                System.out.print("Student ID: ");
                enrollmentService.viewEnrollments(scanner.nextLine());
                break;
            case "3":
                System.out.print("Enrollment ID: ");
                String eId = scanner.nextLine();
                System.out.print("New Status (COMPLETED/CANCELLED): ");
                String status = scanner.nextLine();
                enrollmentService.updateStatus(eId, status.toUpperCase());
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}