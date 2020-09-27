package br.tsantos8080.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class SpanishPrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "¡Hola! Soy el principal servicio de bienvenida.";
    }
}
