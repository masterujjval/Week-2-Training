package com.single_inheritance.smartdevices;

public class Device {
    private final String deviceId;
    private String status;

    // Constructor for Device
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Getter method
    public String getDeviceId() {
        return deviceId;
    }


    public String getStatus() {
        return status;
    }

    // Setter for status
    public void setStatus(String status) {
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: "+deviceId);
        System.out.println("Status: " +status);
    }


}
