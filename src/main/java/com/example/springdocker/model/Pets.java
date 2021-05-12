package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-11
 * Time: 11:16
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pets {
    String id;
    String name;
    String race;
}
