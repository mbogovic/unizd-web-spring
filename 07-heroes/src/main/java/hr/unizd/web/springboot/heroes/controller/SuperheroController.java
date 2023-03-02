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
        superheroService.create(hero);

        return "redirect:/heroes";
    }

    @GetMapping("heroes/edit/{id}")
    public String fetchEditForm(Model model, @PathVariable Integer id) {
        Superhero hero = superheroService.fetchDetails(id);
        model.addAttribute("hero", hero);

        return "heroEditTemplate";
    }

    @PostMapping("/heroes/edit")
    public String edit(@ModelAttribute Superhero hero, Model model) {
        superheroService.edit(hero);

        return "redirect:/heroes";
    }
}
