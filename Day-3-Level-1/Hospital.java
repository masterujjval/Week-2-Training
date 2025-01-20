import java.util.*;

public class Hospital{
public static void main(String args[]){
// object creation
Patient ob=new Patient("John Doe","ADHD",21);
System.out.println("The object is of Student: "+(ob instanceof Patient));
ob.display();
ob.getTotalPatients();
}
}


public class Patient{
static String hospitalName;

int age;
String ailment;
String name;
static int count=0;
// construtor chaining
// constructor to set university name, not a good practise to set static variable in constructor as static variable is instance variable and belongs to class thus should be initialise in class but for testing we are using initialising it in constructor

Patient(String hospitalName){
this.hospitalName=hospitalName;
count++;
}
Patient(String name, String ailment, int age){
this("Gupta Hospital");
this.name=name;
this.ailment=ailment;
this.age=age;
}
// display method
public void display(){
System.out.println("name: "+name+"\nage: "+age+"\nAilment: "+ailment+"\nHospital: "+hospitalName);
}


//static method to display hospital name
public static void getTotalPatients(){
System.out.println("Total patients: "+count);
}

}
