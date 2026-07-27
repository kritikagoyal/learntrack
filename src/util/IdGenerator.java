package util;

public class IdGenerator {

    private static int studentIdCounter = 1;
    private static int nextCourseCounter = 1;

    static int getNextStudentId() {
        return studentIdCounter++;
    }

    static int getNextCourseId() {
        return nextCourseCounter++;
    }
}
