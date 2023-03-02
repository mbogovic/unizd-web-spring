package hr.unizd.web.springboot.heroes.controller;

import hr.unizd.web.springboot.heroes.model.Superhero;
import hr.unizd.web.springboot.heroes.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SuperheroController {

    private final SuperheroService superheroService;

    @Autowired
    public SuperheroController(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping("heroes")
    public String fetchAll(Model model) {
        model.addAttribute("heroList", superheroService.fetchAll());

        return "heroListTemplate";
    }

    @GetMapping("/heroes/{id}")
    public String fetchDetails(Model model, @PathVariable Integer id) {
        Superhero superhero = superheroService.fetchDetails(id);
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
        List<Superhero> superheroList = superheroService.create(hero);
        model.addAttribute("heroList", superheroList);

        return "redirect:/heroes";
    }
}
