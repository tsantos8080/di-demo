package br.tsantos8080.didemo.controllers;

import br.tsantos8080.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @BeforeEach
    public void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        Assertions.assertEquals(GreetingServiceImpl.HELLO, setterInjectedController.sayHello());
    }
}
