import java.util.*;

public class Main{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
// itemcode itemname itemprice and print total cost with given quantity;
System.out.println("Enter total number of Items you bought: ");
int n=sc.nextInt(); // defining string array size;
sc.nextLine();
String item[][]=new String[n][4]; //itemCode itemName itemPrice quantity

// Taking user input from the user

for(int i=0;i<n;i++){
System.out.printf("\nEnter the %d Item Name: \n",i+1);
item[i][0]=sc.nextLine();

System.out.printf("\nEnter the %d Item Code: \n",i+1);
item[0][1]=sc.nextLine();

System.out.printf("\nEnter the %d Item Price: \n",i+1);
item[i][2]=sc.nextLine();

System.out.printf("\nEnter the %d Quantity: \n",i+1);
item[i][3]=sc.nextLine();

}

Item obj=new Item(item);
obj.display(n);

}
}

public class Item{
private String item[][];
Item(String item[][]){
this.item=item;

}


public void display(int n){
int sum=0;
for(int i=0;i<n;i++){
System.out.printf("Item: %s \nItem Code: %s \nItem Price: %s \nQuantity: %s \n",item[i][0],item[i][1],item[i][2],item[i][3]);
sum+=Integer.parseInt(item[i][2]);
sum*=Integer.parseInt(item[i][3]);
System.out.println("--------------------------------------------------------");
}
System.out.println("Total Cost: "+sum);
}
}


