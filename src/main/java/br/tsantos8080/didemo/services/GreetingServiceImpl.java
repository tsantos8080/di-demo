package br.tsantos8080.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO = "Hello!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
