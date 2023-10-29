package org.example.Factory_and_Observer;

public class Pistol implements Weapon{
    private String name;

    public Pistol(String name){
        this.name = name;
    }
    public void display() {
        System.out.println("Pistol: " + name);
    }
}
