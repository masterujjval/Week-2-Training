import java.util.*;


public class Main{

public static void main(String args[]){

// creating object of the class employee

	Employee emp=new Employee("ujjwal Gupta", 1, 3000000);
	emp.display();


}


}

public class Employee{

private static String name;
private static int id;
private static int salary;

Employee(String name,int id, int salary){

	this.name=name;
	this.id=id;
	this.salary=salary;


}

public static void display(){
System.out.println("Name of the Employee: "+name+"\n Id: "+id+ "\n Salary: "+salary);
}


}





