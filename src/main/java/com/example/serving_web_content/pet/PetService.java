package com.example.serving_web_content.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public List<Pet> getPets() {
//        return petRepository.listPets();
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet(1, "ash"));
        pets.add(new Pet(2, "theo"));
        return pets;
    }

//    public Pet getPet(String name) {
//        return cityRepository.findByName(name);
//    }
//
//    public Pet savePet(City city) {
//        return cityRepository.save(city);
//    }
}