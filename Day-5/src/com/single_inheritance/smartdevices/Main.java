package com.single_inheritance.smartdevices;

public class Main {

    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat1 = new Thermostat("TH12345", "Active", 22);

        // Display the thermostat's status
        thermostat1.displayStatus();

        // Update the thermostat's temperature
        thermostat1.setTemperatureSetting(25);

        System.out.println("\nAfter changing the temperature:");
        thermostat1.displayStatus();
    }


}
