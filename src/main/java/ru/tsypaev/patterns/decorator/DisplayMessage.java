package ru.tsypaev.patterns.decorator;

/**
 * @author Vladimir Tsypaev
 */
public class DisplayMessage implements Display {

    public void display(String message) {
        System.out.println(message);
    }
}
