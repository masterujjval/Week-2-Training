package com.multilevel.course_management;

public class PaidOnlineCourse extends OnlineCourse{

    private double fee;       // Course fee
    private double discount;  // Discount in percentage

    // Constructor for PaidOnlineCourse
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call the OnlineCourse constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate the final price after discount
    public double calculateFinalPrice() {
        return fee - (fee * discount / 100);
    }

    // Override displayCourseDetails to include PaidOnlineCourse details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Call the superclass method
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + calculateFinalPrice());
    }

}
