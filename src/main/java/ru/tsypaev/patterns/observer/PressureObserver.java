package ru.tsypaev.patterns.observer;

/**
 * @author Vladimir Tsypaev
 */
public class PressureObserver implements Observer, Visible {

    private int pressure;

    public void update(int temperature, int pressure, int humidity) {
        this.pressure = pressure;
        show();
    }

    public void show() {
        System.out.println("Pressure is " + pressure);
    }
}
