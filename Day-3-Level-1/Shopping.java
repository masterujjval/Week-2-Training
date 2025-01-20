import java.util.*;

public class Main{
public static void main(String args[]){
Product ob=new Product("Maggie",20,5,12);
ob.display();


Product ob2=new Product("Pasta",10,2,9);

ob2.display();

}


}



class Product{

static int discount=20;
final int productID;
String productName;
int price,quantity;


// constructor called
Product(String productName, int price, int quantity,int productID){
this.productID=productID;
this.productName=productName;
this.price=price;
this.quantity=quantity;

}



// static method to update static discount
public void updateDiscount(int discount){
this.discount=discount;
}

public void display(){
System.out.println("productID: "+productID+"\nproductName: "+productName+"\nprice: "+price+"\nquantity: "+quantity+"\n");
}


}
