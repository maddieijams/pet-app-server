package com.example.serving_web_content.pet;

import jakarta.persistence.*;

@Entity
@Table(name = "pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    private Pet() {}

    public Pet(Integer id,
                String name) {
        this.id = id;
        this.name = name;
    }
    public Pet(String name) {
        this.name = name;
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
    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                "name=" + name +
                '}';
    }
}
