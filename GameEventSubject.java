package org.example.Factory_and_Observer;

import java.util.ArrayList;
import java.util.List;

public class GameEventSubject {
    private List<PlayerObserver> observers = new ArrayList<>();

    public void addObserver(PlayerObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String event) {
        for (PlayerObserver observer : observers) {
            observer.update(event);
        }
    }

}
