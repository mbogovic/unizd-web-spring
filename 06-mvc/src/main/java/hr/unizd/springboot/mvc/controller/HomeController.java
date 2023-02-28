package hr.unizd.springboot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String greeting(Model model) {
        model.addAttribute("name", "UNIZD IT team");
        return "home";
    }
}
