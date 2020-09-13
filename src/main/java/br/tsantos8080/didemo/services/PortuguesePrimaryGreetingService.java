package br.tsantos8080.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("br")
public class PortuguesePrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Olá! Sou o principal serviço de saudação.";
    }
}
