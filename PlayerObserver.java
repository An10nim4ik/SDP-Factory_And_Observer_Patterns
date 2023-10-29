package org.example.Factory_and_Observer;

public class PlayerObserver {
    public void update(String event) {
        System.out.println("Player received event: " + event);
    }
}
