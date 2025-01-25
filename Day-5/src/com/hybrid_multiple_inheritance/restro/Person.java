package com.hybrid_multiple_inheritance.restro;

public class Person {
    // superclass
    protected String name;
    protected int id;

    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

}
