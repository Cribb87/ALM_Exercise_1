package com.example.springdocker.controller;

import com.example.springdocker.model.Pets;
import com.example.springdocker.service.PetsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-11
 * Time: 11:20
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/pets")
public class PetsController {

    private final PetsService petsService;

    @GetMapping("/")
    public List<Pets> getAllPets(){
        return petsService.getAllPets();
    }

    @GetMapping("/race")
    public List<Pets> getByRace(@RequestParam String race){
        return petsService.getByRace(race);
    }

    @PostMapping("/add")
    public void addNewPet(@RequestBody Pets pet){
        petsService.saveNewPet(pet);
    }
}
