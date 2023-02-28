package hr.unizd.web.springbootsimpleapp;

import org.springframework.stereotype.Component;

@Component
public class Batman implements SuperHero {

    @Override
    public String provideSuperPower() {
        return "I use cool gadgets!";
    }

}
