package com.example.springdocker.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-12
 * Time: 13:04
 * Project: spring-docker-demo
 * Copyright: MIT
 */
public class MyMathCalc {

    public int add (int a, int b){
        return a+b;
    }

    public int multiply (int a, int b){
        return a*b;
    }


    public double divide (int a, int b) {
        if (b == 0) {
            throw new NumberFormatException("You cant divide with 0");
        } else {
            return a / b;
        }
    }
}
