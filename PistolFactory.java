package org.example.Factory_and_Observer;

public class PistolFactory implements WeaponFactory{
    public Weapon createWeapon(String name){
        return new Pistol(name);
    }

}
