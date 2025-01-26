package com.problem_statements.library_management_system;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();

        LibraryItem book = new Book(1, "Nark", "Ujjwal Gupta");
        LibraryItem magazine = new Magazine(2, "Ek Insaan", "Gupta Ji");
        LibraryItem dvd = new DVD(3, "Inception", "Christopher Nolan");

        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);

        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Time Duration :- " + item.getTimeDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                if (reservableItem.checkAvailability()) {
                    reservableItem.reserveItem("Carl");
                } else {
                    System.out.println("Item is not available for reservation.");
                }
            }

            System.out.println();
        }
    }
}