package com.assisted.vehicle;

public class Truck extends Vehicle
{
    int horsePower;
    Truck(int maxSpeed,String fuelType, int horsePower){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
        this.horsePower=horsePower;
    }
    public void displayInfo(){
        System.out.println("Truck Max Speed: "+maxSpeed+"\nfuelType: "+fuelType+"\nHorse Power: "+horsePower);

    }
}
