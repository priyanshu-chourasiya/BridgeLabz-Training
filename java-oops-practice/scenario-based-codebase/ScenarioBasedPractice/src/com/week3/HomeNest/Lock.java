package com.week3.HomeNest;

public class Lock extends Device {
    public Lock(String deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    public void turnOn() {
        setStatus(true);
    }

    public void turnOff() {
        setStatus(false);
    }

    public void reset() {
        turnOn();
    }
}

