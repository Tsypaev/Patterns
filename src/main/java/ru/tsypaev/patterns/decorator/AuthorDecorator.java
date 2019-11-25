package ru.tsypaev.patterns.decorator;

/**
 * @author Vladimir Tsypaev
 */
public class AuthorDecorator extends MessageDecorator {

    public AuthorDecorator(Display display) {
        super(display);
    }

    @Override
    public void display(String message) {
        super.display(message);
        System.out.println("by Tsypaev Vladimir");
    }
}
