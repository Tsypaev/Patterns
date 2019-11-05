package ru.tsypaev.patterns.observer;

/**
 * @author Vladimir Tsypaev
 */
public interface Observable {

    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObservers();
}
