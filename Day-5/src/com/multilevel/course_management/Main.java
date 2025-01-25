package com.multilevel.course_management;

public class Main {

    public static void main(String[] args) {
        // Create a basic Course object
        Course basicCourse = new Course("Introduction to Programming", 10);
        basicCourse.displayCourseDetails();

        System.out.println();

        // Create an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 20, "Coursera", true);
        onlineCourse.displayCourseDetails();

        System.out.println();

        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java", 30, "Udemy", false, 100, 20);
        paidOnlineCourse.displayCourseDetails();
    }

}
