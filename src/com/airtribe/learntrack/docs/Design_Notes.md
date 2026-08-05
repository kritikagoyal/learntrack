# Architecture & Design Notes

## 1. ArrayList vs. Standard Arrays
`ArrayList` was chosen over standard arrays because it provides dynamic resizing. Standard arrays require a fixed size at instantiation, whereas our system needs to seamlessly accommodate an unknown and growing number of students, courses, and enrollments.

## 2. Static Members Usage
Static fields and methods are used in the `IdGenerator` utility class (`studentIdCounter`, `nextCourseCounter`, and the getter methods). This approach manages a single, application-wide state for ID tracking without requiring object instantiation.

## 3. Inheritance & Its Benefits
Inheritance is implemented with the `Person` base class, which is extended by the `Student` and `Trainer` subclasses.
* **Code Reuse:** Shared attributes (ID, first name, last name, email) are centralized in `Person`, reducing duplication.
* **Polymorphism:** Methods like `getDisplayName()` are overridden in subclasses to provide personalized outputs.
  Establishing this class hierarchy provides the structural foundation needed to implement advanced architectural concepts to dynamically instantiate different user types as the system scales.