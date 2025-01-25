package com.hybrid_multiple_inheritance.vehicle;

public class ElectricVehicle extends Vehicle{

    ElectricVehicle(String model,int maxSpeed){
        super(maxSpeed,model);
    }
    // electric vehicle method
    public void charge(){
        System.out.println("Electic "+getModel()+" can be charged");
    }

}
