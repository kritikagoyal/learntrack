package com.airtribe.learntrack.util;

public class IdGenerator {

    private static int studentIdCounter = 1;
    private static int nextCourseCounter = 1;

    public static int getNextStudentId() {
        return studentIdCounter++;
    }

    public static int getNextCourseId() {
        return nextCourseCounter++;
    }
}
