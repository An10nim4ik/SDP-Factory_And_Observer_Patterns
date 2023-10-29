package org.example.Factory_and_Observer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameEventSubject gameEvents = new GameEventSubject();
        PlayerObserver player1 = new PlayerObserver();
        gameEvents.addObserver(player1);

        WeaponFactory shotgunFactory = new ShotgunFactory();
        WeaponFactory sniperRifleFactory = new SniperRifleFactory();
        WeaponFactory pistolFactory = new PistolFactory();

        String eventDescription = "Nothing happened yet";

        Scanner scanner = new Scanner(System.in);

        ArrayList<Weapon> shotguns = new ArrayList<Weapon>();
        ArrayList<Weapon> sniperRifles = new ArrayList<Weapon>();
        ArrayList<Weapon> pistols = new ArrayList<Weapon>();
        GameEventSubject gameEventSubject = new GameEventSubject();

        int choice;
        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Create Shotgun");
            System.out.println("2. Create Sniper Rifle");
            System.out.println("3. Create Pistol");
            System.out.println("4. Add Player to the game");
            System.out.println("5. Trigger New Event");
            System.out.println("6. Show all the Shotguns");
            System.out.println("7. Show all the Sniper Rifles");
            System.out.println("8. Show all the Pistols");
            System.out.println("9. Notify all the players about last event");
            System.out.println("10. Exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Shotgun name:");
                    scanner.nextLine();
                    String shotgunName = scanner.next();
                    Weapon shotgun = shotgunFactory.createWeapon(shotgunName);
                    shotguns.add(shotgun);
                    shotgun.display();
                    break;
                case 2:
                    System.out.println("Enter Sniper Rifle name:");
                    scanner.nextLine();
                    String sniperRifleName = scanner.next();
                    Weapon sniperRifle = sniperRifleFactory.createWeapon(sniperRifleName);
                    sniperRifles.add(sniperRifle);
                    sniperRifle.display();
                    break;
                case 3:
                    System.out.println("Enter Pistol name:");
                    scanner.nextLine();
                    String pistolName = scanner.nextLine();
                    Weapon pistol = pistolFactory.createWeapon(pistolName);
                    pistols.add(pistol);
                    pistol.display();
                    break;
                case 4:
                    System.out.println("New player has been successfully added!");
                    player1 = new PlayerObserver();
                    gameEvents.addObserver(player1);
                    break;
                case 5:
                    System.out.println("Enter event description:");
                    scanner.nextLine();
                    eventDescription = scanner.nextLine();
                    break;
                case 6:
                    System.out.println("All of the Shotguns:");
                    for(Weapon weapon : shotguns){
                        weapon.display();
                    }
                    break;
                case 7:
                    System.out.println("All of the Sniper Rifles:");
                    for(Weapon weapon : sniperRifles){
                        weapon.display();
                    }
                    break;
                case 8:
                    System.out.println("All of the Pistols:");
                    for (Weapon weapon : pistols){
                        weapon.display();
                    }
                    break;
                case 9:
                    gameEvents.notifyObservers(eventDescription);
                    System.out.println("Every player has been notified about " + eventDescription);
                    break;
                case 10:
                    System.out.println("Exiting the game.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
