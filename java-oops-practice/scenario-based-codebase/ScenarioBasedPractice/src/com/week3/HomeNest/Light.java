package com.week3.HomeNest;

public class Light extends Device {
    public Light(String deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    public void turnOn() {
        setStatus(true);
    }

    public void turnOff() {
        setStatus(false);
    }

    public void reset() {
        turnOff();
    }
}

