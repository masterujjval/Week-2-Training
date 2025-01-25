package com.assisted.hierarchy;

public class Dog extends Animal{
Dog(String name,int age) {
this.name=name;
this.age=age;
}
void makeSound(){
    System.out.println(name+" is barking");
}
}

