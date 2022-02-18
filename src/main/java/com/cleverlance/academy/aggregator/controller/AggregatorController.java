package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Owner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregatorController {

    @GetMapping(path = "/identification")
    public ResponseEntity<Identification> welcome() {
        return ResponseEntity.ok(new Identification("Robertova meteostanice",
                new Address("Jana Žižky", "1598/22","Most"), new Owner("Robert", "Pretschner")));
    }
}
