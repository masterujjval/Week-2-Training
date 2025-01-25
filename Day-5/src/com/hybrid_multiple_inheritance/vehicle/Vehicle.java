package com.hybrid_multiple_inheritance.vehicle;

public class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model){
        this.model=model;
        this.maxSpeed=maxSpeed;
    }
    public  int getMaxSpeed(){
        return maxSpeed;
    }
    public String getModel(){
        return model;
    }

}
