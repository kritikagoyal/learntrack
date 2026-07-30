# Learntrack

A Java-based console-based application for managing students, trainers, courses, and enrollments.

## Features
* **Entity Management:** Core classes for `Student`, `Course`, `Trainer`, and `Enrollment`.
* **Object-Oriented Design:** Demonstrates encapsulation, inheritance (via a base `Person` class), constructor overloading, and polymorphism.
* **Structured Packages:** Follows standard Java package conventions (`entity`, `service`, `ui`, `exception`, `com.airtribe.learntrack.util`).

## Project Structure
```text
src/com/airtribe/learntrack/
 ├── docs/          # Documentation files
 ├── entity/        # Core models (Person, Student, Trainer, Course, Enrollment)
 ├── exception/     # Custom exception handling
 ├── service/       # Business logic layer
 ├── ui/            # Console UI (Main.java)
 └── com.airtribe.learntrack.util/          # Helper classes
```

## Setup & Execution
1. Ensure you have JDK installed.
2. Mark the `src` directory as the "Sources Root" in your IDE.
3. Run the `Main.java` file located in the `ui` package to start the application.
