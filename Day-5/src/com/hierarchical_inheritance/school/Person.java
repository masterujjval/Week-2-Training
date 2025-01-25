package com.hierarchical_inheritance.school;

public class Person {

    private String name;
    private int age;

    // Constructor for Person
     Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display basic information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
