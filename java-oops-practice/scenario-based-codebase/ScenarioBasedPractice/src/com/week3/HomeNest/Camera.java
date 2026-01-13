package com.week3.HomeNest;

public class Camera extends Device {
    public Camera(String deviceId, double energyUsage) {
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
