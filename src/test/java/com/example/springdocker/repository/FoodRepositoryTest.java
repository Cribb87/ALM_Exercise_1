/*
package com.example.springdocker.repository;

import com.example.springdocker.model.Food;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

*/
/**
 * Created by Christoffer Grännby
 * Date: 2021-05-14
 * Time: 13:25
 * Project: spring-docker-demo
 * Copyright: MIT
 *//*

@DataMongoTest
public class FoodRepositoryTest {

    @Autowired
    FoodRepository foodRepository;

    @Test
    void findFoodByCanICookItTest(){
        Food food = new Food();
        food.setId("1");
        food.setName("Lasagne");
        food.setDelicious(true);
        food.setCanICookIt(true);

        foodRepository.save(food);

        List<Food> actual = foodRepository.findFoodByCanICookIt(true);

        assertEquals(true,actual.get(0).isCanICookIt());
    }
}
*/
