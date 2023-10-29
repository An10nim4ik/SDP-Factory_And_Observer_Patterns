package org.example.Factory_and_Observer;

public class SniperRifle implements Weapon {
    private String name;

    public SniperRifle(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Sniper Rifle: " + name);
    }
}
