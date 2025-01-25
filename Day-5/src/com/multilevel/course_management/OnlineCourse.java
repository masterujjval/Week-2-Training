package com.multilevel.course_management;

public class OnlineCourse extends Course{

    private String platform;   // e.g., Udemy, Linkedin
    private boolean isRecorded; // True if the course is recorded

    // Constructor for OnlineCourse
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call the superclass constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Getter for platform
    public String getPlatform() {
        return platform;
    }

    // Getter for isRecorded
    public boolean isRecorded() {
        return isRecorded;
    }

    // Override displayCourseDetails to include OnlineCourse details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Call the superclass method
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }

}
