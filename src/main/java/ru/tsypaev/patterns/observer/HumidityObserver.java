package ru.tsypaev.patterns.observer;

/**
 * @author Vladimir Tsypaev
 */
public class HumidityObserver implements Observer, Visible {

    private int humidity;

    public void update(int temperature, int pressure, int humidity) {
        this.humidity = humidity;
        show();
    }

    public void show() {
        System.out.println("Humidity is " + humidity);
    }
}
