//importing util package
import java.util.*;
//Creating a Book class with attributes title, author, and price


	public class Constructor1{
		public static void main(String[]args){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the title of the book");
			String title = sc.nextLine();
			System.out.println("Enter the name of the author of the book");
			String author = sc.nextLine();
			System.out.println("Enter the prize of the book");
			double prize = sc.nextDouble();
			
			//default constructor with default constructors
			Book c1 = new Book();
			System.out.println("Default Constructor:");
			c1.displayDetails();
			
			//parameterized constructor with user input
			Book c2 = new Book(title,author,prize);
			System.out.println("Parameteried Constructor:");
			c2.displayDetails();
		}
	}
			


class Book{
	String title;
	String author;
	double prize;
	
	//Default constructor of the book class
	Book(){
		title = "Half Girlfriend";
		author = "Chetan Bhagat";
		prize = 290;
	}
	
	//Parameteried constructor of the book class
	Book(String title,String author,double prize){
		this.title = title;
		this.author = author;
		this.prize = prize;
	}
	
	//displayDetails method to display the details of the book
	void displayDetails(){
		System.out.println("Title of the book: " +title+ "\n Author of the book: " +author+ "\n Prize of the book: " +prize);
	}
}
	

			
     
