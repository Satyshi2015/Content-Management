package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class service {
    private Long id;
    private String screen;
    private String description;


    protected service() {
    }

    protected service(Long id, String screen, String description) {
        super();
        this.id = id;
        this.screen = screen;
        this.description = description;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String name) {
        this.screen = screen;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String brand) {
        this.description = description;
    }

    public List<service> listAll() {
        List<service> List = null;
        return null;
    }

    public void save(service product) {
    }

    public service get(int id) {
        return null;
    }

    public void delete(int id) {

    }
    }





