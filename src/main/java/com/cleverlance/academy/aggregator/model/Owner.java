package com.cleverlance.academy.aggregator.model;

import lombok.Data;
import lombok.Value;


@Value //vystaví konstruktor, gettery, settery, hashcode, toString
public class Owner {
    private String firstName;
    private String lastName;



}
