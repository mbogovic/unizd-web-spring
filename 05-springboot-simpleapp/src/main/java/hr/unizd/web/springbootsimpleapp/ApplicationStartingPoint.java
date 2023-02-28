package hr.unizd.web.springbootsimpleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartingPoint implements ApplicationRunner {

    @Autowired
    private SuperHero superHero;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("\nThanks SpringBoot for creating container and basic config, now let us add our code... \n");
        System.out.println("Our superhero power: " + "\"" + superHero.provideSuperPower() + "\"" );
    }
}
