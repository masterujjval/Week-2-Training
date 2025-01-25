package com.hierarchical_inheritance.school;

public class Main {

    public static void main(String[] args) {
        // Create a Teacher object
        Teacher teacher = new Teacher("Mr. Ujjwal", 21, "Mathematics");
        teacher.displayRole();
        System.out.println();

        // Create a Student object
        Student student = new Student("Saloni", 15, "10th Grade");
        student.displayRole();
        System.out.println();

        // Create a Staff object
        Staff staff = new Staff("Mrs. Deepak", 50, "Administration");
        staff.displayRole();
    }

}
