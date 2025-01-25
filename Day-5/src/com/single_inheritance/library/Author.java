package com.single_inheritance.library;

public class Author extends Book{

    private String name;
    private String bio;

    // Constructor for Author
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Calling the constructor of the superclass Book
        this.name = name;
        this.bio = bio;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for bio
    public String getBio() {
        return bio;
    }

    // Overriding the displayInfo method to include author details
    @Override
    public void displayInfo() { // super() can be used aort from the constructor call
        super.displayInfo(); // Calling superclass method to display book info
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }

}
