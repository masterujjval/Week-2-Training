package com.assisted.hierarchy;

public class Bird extends Animal{
    Bird(String name,int age){
        this.name=name;
        this.age=age;

    }
    void makeSound(){

        System.out.println(name+" bird is chirping");
    }
}
