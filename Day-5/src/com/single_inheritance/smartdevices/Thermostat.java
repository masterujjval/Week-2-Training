package com.single_inheritance.smartdevices;

public class Thermostat extends Device{

    private int temperatureSetting;

    // Constructor for Thermostat
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // Calling the constructor of the superclass Device
        this.temperatureSetting = temperatureSetting;
    }

    // Getter for temperatureSetting
    public int getTemperatureSetting() {
        return temperatureSetting;
    }

    // Setter for temperatureSetting
    public void setTemperatureSetting(int temperatureSetting) {
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding the displayStatus method to include temperature settings
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call the superclass method to display general device status
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }

}
