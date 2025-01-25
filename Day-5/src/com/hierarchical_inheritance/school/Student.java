package com.hierarchical_inheritance.school;

public class Student extends Person{

    private String grade;

    // Constructor for Student
     Student(String name, int age, String grade) {
        super(name, age); // Call the superclass constructor
        this.grade = grade;
    }

    // Method to display the role and details of a Student
    public void displayRole() {
        System.out.println("Role: Student");
        super.displayInfo(); // Display name and age from superclass
        System.out.println("Grade: " + grade);
    }

}
