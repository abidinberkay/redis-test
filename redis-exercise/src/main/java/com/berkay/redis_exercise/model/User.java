package com.berkay.redis_exercise.model;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

}
