import java.util.Scanner;

class MovieTicket {
    // Attributes of the MovieTicket class
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, double basePrice) {
        this.movieName = movieName;
        this.price = basePrice;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber) {
        if (isBooked) {
            System.out.println("This ticket is already booked!");
        } else {
            this.seatNumber = seatNumber;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (!isBooked) {
            System.out.println("No ticket booked for this movie yet.");
        } else {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a MovieTicket object
        System.out.println("Enter the name of the movie:");
        String movieName = scanner.nextLine();

        System.out.println("Enter the base price of the ticket:");
        double basePrice = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        MovieTicket ticket = new MovieTicket(movieName, basePrice);

        while (true) {
            // Display menu options
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter seat number: ");
                    String seatNumber = scanner.nextLine();
                    ticket.bookTicket(seatNumber);
                    break;
                case 2:
                    ticket.displayTicketDetails();
                    break;
                case 3:
                    System.out.println("Exiting the system. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

