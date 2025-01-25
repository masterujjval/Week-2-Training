package com.hybrid_multiple_inheritance.vehicle;

public class Main {
    public static void main(String args[]){

        //creating method of pertol

        PetrolVehicle p=new PetrolVehicle("Buggati",550);
        p.refuel();

        ElectricVehicle e=new ElectricVehicle("Ferrari",430);
        e.charge();

    }
}
