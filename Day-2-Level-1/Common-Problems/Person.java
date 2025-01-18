import java.util.*;


public class Main{

public static void main(String args[]){

// calling using object


Person ob=new Person("ujjwal",21);
ob.getter();

Person ob2=new Person(ob);
ob2.getter();


}

}

class Person{

private String name;
private int age;



Person(String name, int age){
this.name=name;
this.age=age;

}

Person(Person ob){
this.name=ob.name;
this.age=ob.age;

}

 public void getter() {
        System.out.println("Person Details: "+ name+"\nAge : "+age);
    }

}


