# LearnTrack

## Project Description
LearnTrack is a Java-based console application designed to manage students, courses, and enrollments. The system uses a menu-driven interface and is built entirely on robust Object-Oriented Programming (OOP) principles, including encapsulation, inheritance, and polymorphism.

## Requirements
* **Java Development Kit (JDK):** Version 21

## Setup & Execution
1. Open your terminal and navigate strictly to the `src` directory:
   ```bash
   cd path/to/learntrack/src
   ```
2. Compile the application:
   ```bash
   javac com/airtribe/learntrack/ui/Main.java
   ```
3. Run the application:
   ```bash
   java com.airtribe.learntrack.ui.Main
   ```

## Project Structure
```text
src/com/airtribe/learntrack/
 ├── entity/        # Core models (Person, Student, Trainer, Course, Enrollment)
 ├── exception/     # Custom exception handling (EntityNotFoundException)
 ├── service/       # Business logic layer
 ├── ui/            # Menu-driven console interface (Main.java)
 └── util/          # Static utilities (IdGenerator)
```