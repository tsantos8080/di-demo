package br.tsantos8080.didemo.controllers;

import br.tsantos8080.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello world!");
        return greetingService.sayGreeting();
    }
}
