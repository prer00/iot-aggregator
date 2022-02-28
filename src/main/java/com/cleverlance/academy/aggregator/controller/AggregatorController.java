package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Owner;
import io.micrometer.core.instrument.Meter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class AggregatorController {

    private final List<Identification> identifications = new ArrayList<>();

//    @GetMapping(path = "/identification")
//    public ResponseEntity<Identification> welcome() {
//        return ResponseEntity.ok(new Identification("Robertova meteostanice",
//                new Address("Jana Žižky", "1598/22","Most"), new Owner("Robert", "Pretschner")));
//    }

    @PostMapping("/server")
    public ResponseEntity<Void> saveServer(@RequestBody Identification identification){
      log.info("Server identification: {}", identification);

      this.identifications.add(identification);

      return ResponseEntity.ok().build();
    }

    @GetMapping("/server")
    public ResponseEntity<List<Identification>> getIdentifications() {

        return ResponseEntity.ok(this.identifications);
    }
}
