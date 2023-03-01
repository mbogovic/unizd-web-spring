package hr.unizd.web.springboot.heroes.controller;

import hr.unizd.web.springboot.heroes.model.Superhero;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SuperheroController {
    private List<Superhero> superheroList = new ArrayList<>(
            List.of(
                    new Superhero(1L, "Batman", "Gadgets", "batman.png"),
                    new Superhero(2L, "Wonderwoman", "Flying", "wonderwoman.png"),
                    new Superhero(3L, "Superman", "Laser sight", "superman.svg"),
                    new Superhero(4L, "Catwoman", "Cat power", "catwoman.png")
            )
    );

    @GetMapping("heroes")
    public String fetchAll(Model model) {
        model.addAttribute("heroList", superheroList);

        return "heroListTemplate";
    }

    @GetMapping("/heroes/{id}")
    public String fetchDetails(Model model, @PathVariable Integer id) {
        Superhero superhero = superheroList.get(id - 1);
        model.addAttribute("heroDetails", superhero);

        return "heroTemplate";
    }

    @GetMapping("heroes/create")
    public String fetchCreateForm(Model model) {
        model.addAttribute("hero", new Superhero());
        return "heroCreateTemplate";
    }

    @PostMapping("/heroes")
    public String create(@ModelAttribute Superhero hero, Model model) {
        if (hero.getId() == null) {
            hero.setId((long) superheroList.size() + 1);
        }

        superheroList.add(hero);
        model.addAttribute("heroList", superheroList);

        return "heroListTemplate";
    }
}
