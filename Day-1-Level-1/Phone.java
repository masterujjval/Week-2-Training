import java.util.*;

public class Main{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);


System.out.println("Enter brand Name: ");
String brand=sc.nextLine();

System.out.println("Enter model Name: ");
String model=sc.nextLine();


System.out.println("Enter Price: ");

int price=sc.nextInt();

// setting the method


MobilePhone obj=new MobilePhone(brand,model,price);
MobilePhone obj2=new MobilePhone("Xiomi","Poco X3 pro", 30000);
//displaying results for the Book Question
obj.display();
System.out.println("\n");
obj2.display();
System.out.println("\n");
}
}

public class MobilePhone{

String brand;
String model;
int price;

MobilePhone(String brand, String model, int price){
	this.brand=brand;
	this.model=model;
	this.price=price;


}

public void display(){

System.out.printf("Output\n--------------------------------------\n");
System.out.printf("Brand : %s \nModel: %s \nPrice: %d",brand,model,price);



}
}
