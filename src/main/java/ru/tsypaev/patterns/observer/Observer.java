package ru.tsypaev.patterns.observer;

/**
 * @author Vladimir Tsypaev
 */
public interface Observer {

    public void update(int temperature, int pressure, int humidity);
}
