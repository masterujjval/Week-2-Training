package com.problem_statements.vechicle_rental_system;
import java.util.*;
public class VehicleRentalSystemMain {

    public static void main(String[] args) {
        Vehicle car = new Car("MP04378", "Petrol", 160, "19794");
        Vehicle truck = new Truck("UP90893", "Petrol", 200, "199302");
        Vehicle bike = new Bike("B963188", "Petrol", 30, "199384");
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(bike);
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("Rental Cost for 5 days :- " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost :- " + insurable.calculateInsurance());
                insurable.getInsuranceDetails();
            }

        }

    }


}
