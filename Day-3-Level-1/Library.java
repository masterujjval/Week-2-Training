import java.util.*;

public class Library{
public static void main(String args[]){
// object creation 
Book ob=new Book("Cosmos","Carl Saga",78277298);
System.out.println(ob instanceof Book);
ob.display();
ob.displayLibraryName();
}

}


public class Book{

static String libraryName="Takshishila";

String title;
String author;
final int isbn;

Book(String title, String author, int isbn){
this.title=title;
this.author=author;
this.isbn=isbn;
}


//method to print library name

public static void displayLibraryName(){

System.out.println("Library name is: "+libraryName);

}
public void display(){
System.out.println("Title: "+title+"\nauthor: "+author+"\nisbn: "+isbn);
}

}


