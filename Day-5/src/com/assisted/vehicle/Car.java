package com.assisted.vehicle;

public class Car extends Vehicle {
int seatCapacity;

Car(int maxSpeed,String fuelType, int seatCapacity){
    this.maxSpeed=maxSpeed;
    this.fuelType=fuelType;
    this.seatCapacity=seatCapacity;
}
    public void displayInfo(){
        System.out.println("Car Max Speed: "+maxSpeed+"\nfuelType: "+fuelType+"\nSeat Capacity: "+seatCapacity);

    }
}
