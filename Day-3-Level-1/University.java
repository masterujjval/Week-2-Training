import java.util.*;

public class University{
public static void main(String args[]){
// object creation
Student ob=new Student("Ujjwal Gupta",368902,'A');
System.out.println("The object is of Student: "+(ob instanceof Student));
ob.display();
ob.displayTotalStudents();
}
}


public class Student{
static String universityName;

int rollNumber;
char grade;
String name;
static int count=0;
// construtor chaining
// constructor to set university name, not a good practise to set static variable in constructor as static variable is instance variable and belongs to class thus should be initialise in class but for testing we are using initialising it in constructor

Student(String universityName){
this.universityName=universityName;
count++;
}
Student(String name, int rollNumber, char grade){
this("TIT");
this.name=name;
this.rollNumber=rollNumber;
this.grade=grade;
}
// display method
public void display(){
System.out.println("Roll Number: "+rollNumber+"\nName: "+name+"\ngrade: "+grade+"\nUniversity: "+universityName);
}


//static method to display university name
public static void displayTotalStudents(){
System.out.println("Total students: "+count);
}

}
