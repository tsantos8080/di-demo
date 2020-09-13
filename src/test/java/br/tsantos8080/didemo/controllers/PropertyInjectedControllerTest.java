package br.tsantos8080.didemo.controllers;

import br.tsantos8080.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() {
        Assertions.assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}
