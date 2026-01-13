package com.week3.HomeNest;

public class Thermostat extends Device {
    public Thermostat(String deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    public void turnOn() {
        setStatus(true);
    }

    public void turnOff() {
        setStatus(false);
    }

    public void reset() {
        setStatus(false);
    }
}

