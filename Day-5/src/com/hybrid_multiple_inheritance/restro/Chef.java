package com.hybrid_multiple_inheritance.restro;

public class Chef extends Person implements Worker {

    Chef(String name, int id){
        super(name,id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef "+getName()+" is cooking");
    }
}
