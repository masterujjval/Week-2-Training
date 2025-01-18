import java.util.*;


public class Main{

public static void main(String args[]){

// callng uding child class

SavingsAccount ob=new SavingsAccount();
ob.setter(50000.897);
ob.setterT(36178566,"Ujjwal Gupta");

}

}


public class BankAccount{

public int  accountNumber;
protected String accountHolder;
private double balance;

public void setter(double x){
balance=x;
System.out.println("Balance: "+balance);
}

}

// creating a child class using extends

 class SavingsAccount extends BankAccount{

// setting balance  in child class, we cant access private variable we cant access it using child 

public void setterT(int x, String y){
accountNumber=x;
System.out.println("Account Number: "+accountNumber);

accountHolder=y;
System.out.println("Account Holder: "+accountHolder);

}

}



