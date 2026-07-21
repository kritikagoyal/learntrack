package com.airtribe.learntrack.entity;

public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Base display behavior
    public String getDisplayName() {
        return firstName + " " + lastName;
    }

    // Standard getters and setters would go here
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}