import java.util.*;


public class Bank{
public static void main(String args[]){
// creating objects
BankAccount obj=new BankAccount("ujjwal Gupta",371858910);
obj.display();

obj.getTotalAccounts();
}
}

class BankAccount{

static String bankName="Fedreal Bank";

static int count=0;
String accountHolder;

final int accountNumber;

// constructor 
BankAccount(String accountHolder, int accountNumber)
{
this.accountHolder=accountHolder;
this.accountNumber=accountNumber;
count++;
}

//static method to dislplay total accounts
public static void getTotalAccounts(){
System.out.println("The total counts are: "+count);

}
public void display(){
System.out.println("The account holder name is: "+accountHolder+"\naccount Number: "+accountNumber);
}

}


