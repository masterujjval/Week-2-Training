package com.assisted.vehicle;

public class MotorCycle extends Vehicle {

    int cc;
    MotorCycle(int maxSpeed,String fuelType, int cc){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
        this.cc=cc;
    }
    public void displayInfo(){
        System.out.println("Motorcycle Max Speed: "+maxSpeed+"\nfuelType: "+fuelType+"\nCC: "+cc);

    }


}
