package br.tsantos8080.didemo.controllers;

import br.tsantos8080.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    public void setUp(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        Assertions.assertEquals(GreetingServiceImpl.HELLO, constructorInjectedController.sayHello());
    }
}
