package com.cleverlance.academy.aggregator.model;

import lombok.Value;

@Value
public class Identification {

    private String name;
    private Address adress;
    private Person owner;


}
