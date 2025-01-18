import java.util.*;


public class Main{

public static void main(String args[]){

// callng uding child class

Child ob=new Child();
ob.setter(9.89);
ob.setterN("john Doe");

}

}


public class Student{

public String rollNumber;
protected String name;
private double CGPA;

public void setter(double x){
CGPA=x;
System.out.println("Cgpa is: "+CGPA);
}

}

// creating a child class using extends

 class Child extends Student{

// setting cgpa in child class

public void setterN(String x){
name=x;
System.out.println("name: "+name);
}

}





