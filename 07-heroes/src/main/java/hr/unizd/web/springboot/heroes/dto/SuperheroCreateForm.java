package hr.unizd.web.springboot.heroes.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class SuperheroCreateForm {

    @Size(min = 3, max = 30, message = "Name should have at least 3 chars")
    private String name;

    @NotEmpty(message = "Superpower is not allowed to be empty")
    private String superpower;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }
}
