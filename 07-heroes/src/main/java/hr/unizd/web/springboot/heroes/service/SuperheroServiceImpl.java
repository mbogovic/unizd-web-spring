package hr.unizd.web.springboot.heroes.service;

import hr.unizd.web.springboot.heroes.dto.SuperheroCreateForm;
import hr.unizd.web.springboot.heroes.dto.SuperheroEditForm;
import hr.unizd.web.springboot.heroes.exception.EntityNotFoundException;
import hr.unizd.web.springboot.heroes.model.Superhero;
import hr.unizd.web.springboot.heroes.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuperheroServiceImpl implements SuperheroService {

    private final SuperheroRepository superheroRepository;

    @Autowired
    public SuperheroServiceImpl(SuperheroRepository superheroRepository) {
        this.superheroRepository = superheroRepository;
    }

    public List<Superhero> fetchAll() {
        return superheroRepository.fetchAll();
    }

    public Superhero fetchDetails(Integer id) {
        Optional<Superhero> superheroOptional = superheroRepository.fetchDetails(id);
        if (superheroOptional.isEmpty()) {
            throw new EntityNotFoundException("Entity with id " + id + " not found!");
        }

        return superheroOptional.get();
    }

    public List<Superhero> create(SuperheroCreateForm superheroCreateForm) {
        List<Superhero> superheroList = superheroRepository.fetchAll();

        Superhero superhero = new Superhero();
        superhero.setId(superheroList.size() + 1);
        superhero.setName(superheroCreateForm.getName());
        superhero.setSuperpower(superheroCreateForm.getSuperpower());

        superheroRepository.create(superhero);

        return superheroRepository.fetchAll();
    }

    public List<Superhero> edit(SuperheroEditForm superheroEditForm) {
        Superhero superhero = fetchDetails(superheroEditForm.getId());
        superhero.setName(superheroEditForm.getName());
        superhero.setSuperpower(superheroEditForm.getSuperpower());

        superheroRepository.edit(superhero);

        return superheroRepository.fetchAll();
    }

    public List<Superhero> delete(Integer id) {
        superheroRepository.delete(id);
        return superheroRepository.fetchAll();
    }
}
