package br.tsantos8080.didemo.controllers;

import br.tsantos8080.didemo.services.GreetingServiceImpl;
import br.tsantos8080.didemo.services.PrimaryGreetingService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrimaryInjectedControllerTest {
    private PrimaryGreetingService primaryGreetingService;

    @BeforeEach
    public void setUp() {
//        this.primaryGreetingService = new PrimaryGreetingService();
    }

    @Test
    public void testGreeting() {
        Assertions.assertEquals("Hello! I'm the primary greeting service.", primaryGreetingService.sayGreeting());
    }
}
