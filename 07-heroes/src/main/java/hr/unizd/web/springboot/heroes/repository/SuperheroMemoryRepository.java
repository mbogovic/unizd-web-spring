package hr.unizd.web.springboot.heroes.repository;

import hr.unizd.web.springboot.heroes.model.Superhero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class SuperheroMemoryRepository implements SuperheroRepository {

    private List<Superhero> superheroList = new ArrayList<>(
            List.of(
                    new Superhero(1, "Batman", "Gadgets", "batman.png"),
                    new Superhero(2, "Wonderwoman", "Flying", "wonderwoman.png"),
                    new Superhero(3, "Superman", "Laser sight", "superman.svg"),
                    new Superhero(4, "Catwoman", "Cat power", "catwoman.png")
            )
    );

    public List<Superhero> fetchAll() {
        return superheroList;
    }

    public Optional<Superhero> fetchDetails(Integer id) {
        return superheroList.stream()
                .filter(superhero -> superhero.getId().equals(id))
                .findFirst();
    }

    public boolean create(Superhero superhero) {
        return superheroList.add(superhero);
    }

    public void edit(Superhero newSuperhero) {
        int index = 0;

        for (int i = 0; i < superheroList.size(); i++) {
            if (superheroList.get(i).getId().equals(newSuperhero.getId())) {
                index = i;
                break;
            }
        }

        superheroList.set(index, newSuperhero);
    }

}
