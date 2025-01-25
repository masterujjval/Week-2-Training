package com.assisted.hierarchy;

public class Cat extends Animal{
Cat(String name,int age) {
this.name=name;
this.age=age;
}
void makeSound(){
    System.out.println(name+" is hissing");
}
}

