package com.assisted.vehicle;



public class Main {

    public static void main(String args[]){

        Car car=new Car(150,"Power",4);
        car.displayInfo();
        MotorCycle motorCycle=new MotorCycle(200,"Power",600);
        motorCycle.displayInfo();

        Truck truck =new Truck(130,"Diesel",2000);
        truck.displayInfo();


    }

}
