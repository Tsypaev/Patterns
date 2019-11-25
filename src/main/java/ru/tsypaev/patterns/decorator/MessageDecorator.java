package ru.tsypaev.patterns.decorator;

/**
 * @author Vladimir Tsypaev
 */
public abstract class MessageDecorator implements Display {

    private Display display;

    public MessageDecorator(Display display){
        this.display = display;
    }

    @Override
    public void display(String message){
        display.display(message);
    }
}
