package lk.ijse.behavioral.observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyToAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyToAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
