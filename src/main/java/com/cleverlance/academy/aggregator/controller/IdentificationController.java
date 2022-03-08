package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.service.IdentificationService;
import org.openapitools.api.IdentificationApi;
import org.openapitools.model.Address;
import org.openapitools.model.Identification;
import org.openapitools.model.Owner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentificationController implements IdentificationApi {

    private final IdentificationService identificationService;

    public IdentificationController(IdentificationService identificationService) {
        this.identificationService = identificationService;
    }

    @Override
    public ResponseEntity<Identification> getIdentification() {
        com.cleverlance.academy.aggregator.model.Identification identification = this.identificationService.getIdentification();
        return ResponseEntity.ok(new Identification()
                .name("Moje meteostanice")
                .owner(new Owner().firstName("Karel").lastName("Barel"))
                .address(new Address()
                        .street("Hlavni").
                        streetNumber("6").city("Brno")));
    }
}
