package com.week3.HomeNest;

public abstract class Device implements IControllable {
    private String deviceId;
    private boolean status;
    protected double energyUsage;
    private String firmwareLog;

    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "";
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    protected void updateLog(String entry) {
        firmwareLog += entry + "\n";
    }

    public double totalEnergy(double hours) {
        return energyUsage * hours;
    }
}
