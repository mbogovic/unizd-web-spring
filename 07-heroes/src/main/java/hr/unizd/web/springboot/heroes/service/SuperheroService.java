package hr.unizd.web.springboot.heroes.service;

import hr.unizd.web.springboot.heroes.dto.SuperheroCreateForm;
import hr.unizd.web.springboot.heroes.dto.SuperheroEditForm;
import hr.unizd.web.springboot.heroes.model.Superhero;

import java.util.List;

public interface SuperheroService {

    List<Superhero> fetchAll();

    Superhero fetchDetails(Integer id);

    List<Superhero> create(SuperheroCreateForm superheroCreateForm);

    List<Superhero> edit(SuperheroEditForm superheroEditForm);

    List<Superhero> delete(Integer id);
}
