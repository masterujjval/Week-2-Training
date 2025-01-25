package com.assisted.hierarchy;

public class Main {
    public static void main(String args[]){

        Dog dog=new Dog("German Shepherd",9);
        dog.makeSound();
        Animal bird =new Bird("Parrot",2);
        bird.makeSound();

        Cat cat=new Cat("Persian",9);
        cat.makeSound();

    }
}
