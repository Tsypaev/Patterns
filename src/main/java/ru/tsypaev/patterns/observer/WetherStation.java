package ru.tsypaev.patterns.observer;

import java.util.ArrayList;

/**
 * @author Vladimir Tsypaev
 */
public class WetherStation implements Observable {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private int temperature;
    private int pressure;
    private int humidity;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, pressure, humidity);
        }
    }

    public void setAttribute(int temperature, int pressure, int humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }
}
