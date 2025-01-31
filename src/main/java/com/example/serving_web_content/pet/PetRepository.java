package com.example.serving_web_content.pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long>{
//    @Query("SELECT w FROM Pets w " +
//            " WHERE (:city is NULL OR :city = '' OR w.city = :city)" +
//            " AND w.is_del = 0")
//    List<Pet> listPets();
};
