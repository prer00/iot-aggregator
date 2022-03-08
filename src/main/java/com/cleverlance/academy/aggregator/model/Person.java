package com.cleverlance.academy.aggregator.model;

import lombok.Data;
import lombok.Value;

import javax.validation.constraints.Email;


@Value //vystaví konstruktor, gettery, settery, hashcode, toString
public class Person {
    private String firstName;
    private String lastName;

    @Email
    private String email;

    private String gender;





}
