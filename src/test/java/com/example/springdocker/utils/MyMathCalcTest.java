package com.example.springdocker.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-14
 * Time: 10:14
 * Project: spring-docker-demo
 * Copyright: MIT
 */
public class MyMathCalcTest {

    private MyMathCalc myMathCalc;

    @BeforeEach
    void beforeMethod(){
        myMathCalc = new MyMathCalc();
    }

    @DisplayName("Testing if addition works")
    @Test
    void additionTest(){
        int expected = 5;
        int actual = myMathCalc.add(3,2);

        assertEquals(expected, actual);
    }

    @DisplayName("Testing if multiplying works")
    @Test
    void multiplyingTest(){
        int expected = 20;
        int notExpecting = 15;
        int actual = myMathCalc.multiply(4,5);

        assertEquals(expected, actual);
        assertNotEquals(notExpecting, actual);
    }

    @DisplayName("Testing if dividing works")
    @Test
    void dividingTest(){
        int expected = 3;
        int notExpecting = 4;
        double actual = myMathCalc.divide(9,3);

        assertEquals(expected, actual);
        assertNotEquals(notExpecting, actual);
    }

    @DisplayName("Testing response when dividing with 0")
    @Test
    void dividingWithZeroTest(){
        assertThrows(NumberFormatException.class, () -> myMathCalc.divide(2,0));
    }
}