package hr.unizd.web.springboot.heroes.service;

import hr.unizd.web.springboot.heroes.model.Superhero;

import java.util.List;

public interface SuperheroService {

    List<Superhero> fetchAll();

    Superhero fetchDetails(Integer id);

    List<Superhero> create(Superhero superhero);

    List<Superhero> edit(Superhero superhero);
}
