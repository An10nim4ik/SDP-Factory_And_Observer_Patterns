package org.example.Factory_and_Observer;

public class ShotgunFactory implements WeaponFactory {
    public Weapon createWeapon(String name) {
        return new Shotgun(name);
    }
}
