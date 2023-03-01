package hr.unizd.web.springboot.heroes.repository;

import hr.unizd.web.springboot.heroes.model.Superhero;

import java.util.List;
import java.util.Optional;

public interface SuperheroRepository {
    List<Superhero> fetchAll();

    Optional<Superhero> fetchDetails(Integer id);

    boolean create(Superhero superhero);

}
