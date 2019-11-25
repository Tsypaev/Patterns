package ru.tsypaev.patterns.decorator;

import org.junit.jupiter.api.Test;

/**
 * @author Vladimir Tsypaev
 */
class AuthorDecoratorTest {

    private MessageDecorator messageDecorator = new EndMessageDecorator (new AuthorDecorator(new DisplayMessage()));

    @Test
    void shouldMakeDecorate(){
        messageDecorator.display("Hello world!");
    }

}