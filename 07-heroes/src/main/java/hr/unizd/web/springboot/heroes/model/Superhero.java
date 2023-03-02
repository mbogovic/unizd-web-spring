package hr.unizd.web.springboot.heroes.model;

public class Superhero {

    private Integer id;

    private String name;

    private String superpower;
    private String iconLocation;

    public Superhero() {
    }

    public Superhero(Integer id, String name, String superpower, String iconLocation) {
        this.id = id;
        this.name = name;
        this.superpower = superpower;
        this.iconLocation = iconLocation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getIconLocation() {
        return iconLocation;
    }

    public void setIconLocation(String iconLocation) {
        this.iconLocation = iconLocation;
    }
}
