package com.hierarchical_inheritance.school;

public class Staff extends Person{

    private String department;

    // Constructor for Staff
    public Staff(String name, int age, String department) {
        super(name, age); // Call the superclass constructor
        this.department = department;
    }

    // Method to display the role and details of a Staff
    public void displayRole() {
        System.out.println("Role: Staff");
        super.displayInfo(); // Display name and age from superclass
        System.out.println("Department: " + department);
    }

}
