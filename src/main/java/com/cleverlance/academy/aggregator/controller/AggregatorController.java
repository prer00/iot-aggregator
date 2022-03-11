package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import com.cleverlance.academy.aggregator.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
//localhost:8080/swagger-ui/index.html
@Slf4j
@RestController
public class AggregatorController {

    private final List<Identification> identifications = new ArrayList<>();

//    @GetMapping(path = "/identification")
//    public ResponseEntity<Identification> welcome() {
//        return ResponseEntity.ok(new Identification("Robertova meteostanice",
//                new Address("Vedlejší", "1337/24","Most"), new Person("Robert", "Pretschner")));
//    }

    private PersonService personService;

    public AggregatorController(PersonService personService) {
        this.personService = personService;
    }

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

    @PostMapping("/person")
    public ResponseEntity<Void> savePerson(@RequestBody Person person){

        this.personService.save(person);

        return ResponseEntity.ok().build();

    }
}
