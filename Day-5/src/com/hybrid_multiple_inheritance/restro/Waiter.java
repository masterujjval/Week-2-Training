package com.hybrid_multiple_inheritance.restro;

public class Waiter extends Person implements Worker{


    Waiter(String name,int id){
        super(name,id);
    }
    @Override
    public void performDuties(){
        System.out.println("Waiter "+getName()+" is taking orders");
    }

}
