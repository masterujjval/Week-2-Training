import java.util.*;

public class Main{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);

String book[][]=new String [1][3];
System.out.println("Enter Book Name: ");
String title=sc.nextLine();

System.out.println("Enter Author Name: ");
String author=sc.nextLine();


System.out.println("Enter Price Name: ");

String price=sc.nextLine();

// setting the method
book[0][0]=title;
book[0][1]=author;
book[0][2]=price;

Book obj=new Book(book);

//displaying results for the Book Question
obj.display();
System.out.println("\n");
}
}

public class Book{

String book[][]=new String [1][3];

Book(String book[][] ){
	this.book=book;


}

public void display(){
for(int i=0;i<1;i++){
System.out.printf("Title : %s \nAuthor: %s \nPrice: %s",book[0][0],book[0][1],book[0][2]);
}


}
}
