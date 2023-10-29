package org.example.Factory_and_Observer;


public class SniperRifleFactory implements WeaponFactory {
    public Weapon createWeapon(String name) {
        return new SniperRifle(name);
    }
}
