package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.repository.FoodRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-14
 * Time: 14:11
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@ExtendWith(MockitoExtension.class)
class FoodServiceTest {

    private FoodService foodService;

    @Mock
    FoodRepository mockFoodRepository;

    @BeforeEach
    void init(){
        foodService = new FoodService(mockFoodRepository);
    }

    @DisplayName("Testing getting all food in a list")
    @Test
    void getListWithAllFoodTest(){
        Food f1 = new Food();
        f1.setId("1");
        f1.setName("Pannkakor");
        f1.setCanICookIt(true);
        f1.setDelicious(true);

        Food f2 = new Food();
        f2.setId("2");
        f2.setName("Oxfilé");
        f2.setCanICookIt(true);
        f2.setDelicious(true);

        Food f3 = new Food();
        f1.setId("3");
        f1.setName("Lasagne");
        f1.setCanICookIt(true);
        f1.setDelicious(true);

        when(mockFoodRepository.findAll()).thenReturn(Arrays.asList(f1, f2, f3));

        List<Food> actualFood = foodService.getFoods();

        assertEquals(f1, actualFood.get(0));
        assertEquals(f2, actualFood.get(1));
        assertEquals(f3, actualFood.get(2));

        verify(mockFoodRepository).findAll();
    }

    @DisplayName("Test saving a new food")
    @Test
    void saveNewFoodTest(){
        Food f1 = new Food();
        f1.setId("1");
        f1.setName("Pannkakor");
        f1.setCanICookIt(true);
        f1.setDelicious(true);

        when(mockFoodRepository.save(any())).thenReturn(f1);

        Food actualFood = foodService.saveNewFood(f1);

        assertEquals(f1, actualFood);

        verify(mockFoodRepository).save(any());
    }

    @DisplayName("Check if food is cookable")
    @Test
    void checkIfFoodIsCookableTest(){
        Food f1 = new Food();
        f1.setId("1");
        f1.setName("Pannkakor");
        f1.setCanICookIt(true);
        f1.setDelicious(true);

        when(mockFoodRepository.findFoodByCanICookIt(true)).thenReturn(Arrays.asList(f1));

        List<String> actualFood = foodService.getCookableFoods();

        assertEquals(f1.getName(), actualFood.get(0));

        verify(mockFoodRepository).findFoodByCanICookIt(true);
    }
}