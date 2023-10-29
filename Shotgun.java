package org.example.Factory_and_Observer;

public class Shotgun implements Weapon {
    private String name;

    public Shotgun(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Shotgun: " + name);
    }
}
