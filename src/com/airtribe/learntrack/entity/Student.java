package com.airtribe.learntrack.entity;

public class Student {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String batch;
    private boolean active;

    // Default constructor
    public Student() {}

    // Parametrized constructor - with email
    public Student(String id, String firstName, String lastName, String email, String batch, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.batch = batch;
        this.active = active;
    }

    // Parametrized constructor - without email
    public Student(String id, String firstName, String lastName, String batch, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.batch = batch;
        this.active = active;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getBatch() { return batch; }
    public void setBatch(String batch) { this.batch = batch; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}