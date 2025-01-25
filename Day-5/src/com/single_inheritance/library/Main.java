package com.single_inheritance.library;

public class Main {
    public static void main(String args[]){

        // Creating an Author object (includes Book information)
        Author author1 = new Author("The Cosmos", 1980, "Carl Sagan", "An American astronomer, astrophysicist, and author.");

        // Display book and author information
        author1.displayInfo();
    }
}
