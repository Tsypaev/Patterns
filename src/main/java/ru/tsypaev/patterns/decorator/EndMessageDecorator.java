package ru.tsypaev.patterns.decorator;

/**
 * @author Vladimir Tsypaev
 */
public class EndMessageDecorator extends MessageDecorator {

    public EndMessageDecorator(Display display) {
        super(display);
    }

    @Override
    public void display(String message) {
        super.display(message);
        System.out.println("--END OF MESSAGE--");
    }
}
