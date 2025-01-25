package com.single_inheritance.library;

public class Book {
    private String title;
    private int publicationYear;

    // Constructor for Book
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    // Getter for publicationYear
    public int getPublicationYear() {
        return publicationYear;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }

}
