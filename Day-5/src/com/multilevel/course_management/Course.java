package com.multilevel.course_management;

public class Course {

    private String courseName;
    private int duration; // Duration in hours

    // Constructor for Course
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }

}
