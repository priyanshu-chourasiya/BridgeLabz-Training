/*
 * . "HomeNest – Smart Home Device Manager"
Story: A tech company builds HomeNest, a system to control smart lights, ACs, locks, and
cameras.
Requirements:
● Device base class: deviceId, status, energyUsage.
● Subclasses: Light, Camera, Thermostat, Lock.
● Interface IControllable: turnOn(), turnOff(), reset().
● Use constructors to register devices with user.
● Encapsulation: device status cannot be modified externally.
● Operators for energy usage calculations.
● Polymorphism: reset() behavior varies by device.
● Use access modifiers to secure firmware update logs.
 */

package com.week3.HomeNest;

public class Main {
    public static void main(String[] args) {
        Light l = new Light("L1", 5);
        Camera c = new Camera("C1", 8);
        Thermostat t = new Thermostat("T1", 15);
        Lock k = new Lock("K1", 3);

        l.turnOn();
        c.turnOn();
        t.turnOn();
        k.turnOn();

        l.reset();
        c.reset();
        t.reset();
        k.reset();

        System.out.println(l.isOn());
        System.out.println(c.isOn());
        System.out.println(t.isOn());
        System.out.println(k.isOn());

        System.out.println(t.totalEnergy(10));
    }
}
