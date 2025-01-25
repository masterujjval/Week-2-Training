package com.hybrid_multiple_inheritance.vehicle;

public class PetrolVehicle extends Vehicle implements Refuelable{

    PetrolVehicle(String model,int maxSpeed){
        super(maxSpeed,model);

    }
    @Override
    public void refuel(){
        System.out.println("Vehicle "+getModel()+" can be refuled");
    }

}
