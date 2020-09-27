package br.tsantos8080.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class GermanPrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hallo! Ich bin der Hauptgrußdienst.";
    }
}
