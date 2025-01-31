package com.example.serving_web_content.pet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/pet")
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> getPets() {
        return petService.getPets();
    }
}