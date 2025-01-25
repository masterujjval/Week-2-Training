package com.hierarchical_inheritance.school;

public class Teacher extends Person{
    private String subject;

    // Constructor for Teacher
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call the superclass constructor
        this.subject = subject;
    }

    // Method to display the role and details of a Teacher
    public void displayRole() {
        System.out.println("Role: Teacher");
        super.displayInfo(); // Display name and age from superclass
        System.out.println("Subject: " + subject);
    }

}
