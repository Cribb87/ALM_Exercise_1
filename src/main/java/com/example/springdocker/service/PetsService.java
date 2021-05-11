package com.example.springdocker.service;

import com.example.springdocker.model.Pets;
import com.example.springdocker.repository.PetsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-11
 * Time: 11:20
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@RequiredArgsConstructor
@Service
public class PetsService {

    private final PetsRepository petsRepository;

    public List<Pets> getAllPets (){
        return petsRepository.findAll();
    }

    public void saveNewPet (Pets pet){
        petsRepository.save(pet);
    }

    public List<Pets> getByRace (String race){
        return petsRepository.findAnimalByRace(race);
    }
}
