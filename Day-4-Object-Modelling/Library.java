import java.util.*;

// driver class and method
public class Main{
public static void main(String args[]){

// Creating objects of Book
Book book1=new Book("Cosmos","Carl Sagan");
book1.print();

Book book2=new Book("Hunger Games","Ujjwal Gupta");
book2.print();
// creating library

Library lib1=new Library("Takshashila");
Library lib2=new Library("Indi");

lib1.addBook(book1);
lib2.addBook(book2);

lib1.display();
lib2.display();

}


}


public class Book{

private String title;
private String author;

Book (String title, String author){
this.title=title;
this.author=author;
}
// gettter method to get title 
public String getTitle(){
return title;
}

// getter method to get the author
public String getAuthor(){
return author;
}

public void print(){
System.out.println("Book: "+title+"\nAuthor: "+author+"\n");
}

// here we created our book library
}


// creating Library class
public class Library{

private String name;
private ArrayList<Book> books;

// constructor of library class 
Library(String name){
this.name=name;
this.books=new ArrayList<>();
}
// adding book to our library
public void addBook(Book kitab){
books.add(kitab);
}


// displaying books present in current object of lirary
public void display(){
System.out.println("The books are in "+name+" Library are: ");
for(Book s:books){
System.out.println(s.getTitle());
}


}


}





