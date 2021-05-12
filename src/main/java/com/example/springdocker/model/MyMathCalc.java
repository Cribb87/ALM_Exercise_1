package com.example.springdocker.model;

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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyMathCalc {

    public int add (int a, int b){
        return a+b;
    }

    public int multiply (int a, int b){
        return a*b;
    }

    public int divide (int a, int b){
        return a/b;
    }
}
