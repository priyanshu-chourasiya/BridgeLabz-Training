package com.inheritance.SmartHomeDevices;

public class Device {

    protected String deviceId;
    protected String status; // ON or OFF

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
