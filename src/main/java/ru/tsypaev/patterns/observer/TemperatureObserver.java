package ru.tsypaev.patterns.observer;

/**
 * @author Vladimir Tsypaev
 */
public class TemperatureObserver implements Observer, Visible{

    private int temperature;

    public void update(int temperature, int pressure, int humidity) {
        this.temperature = temperature;
        show();
    }

    public void show() {
        System.out.println("Temperature is " + temperature);
    }
}
