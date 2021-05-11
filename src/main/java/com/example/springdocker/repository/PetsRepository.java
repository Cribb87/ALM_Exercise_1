package com.example.springdocker.repository;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.Pets;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-11
 * Time: 11:20
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@Repository
public interface PetsRepository extends MongoRepository <Pets, String> {

    List<Pets> findAnimalByRace(String race);
}
