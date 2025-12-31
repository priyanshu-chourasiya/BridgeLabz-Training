package com.inheritance.SmartHomeDevices;

public class Main {

    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("TH101", "ON", 24);
        thermostat.displayStatus();
    }
}
