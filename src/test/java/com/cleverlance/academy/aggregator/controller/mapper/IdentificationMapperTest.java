package com.cleverlance.academy.aggregator.controller.mapper;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class IdentificationMapperTest {

    private static final IdentificationMapper MAPPER = Mappers.getMapper(IdentificationMapper.class);

    @Test
    void toIdentification() {
        Identification identification = new com.cleverlance.academy.aggregator.model.Identification("Moje meteostanice", new Address("Hlavni", "6", "Brno"),
                new Person("Karel", "Barel","karelbarel@cvut.cz","MALE"));

        org.openapitools.model.Identification converted = MAPPER.toIdentifiaction(identification);

        assertEquals("Moje meteostanice", converted.getName());

        assertEquals("Hlavni",converted.getAddress().getStreet());

        assertEquals("6", converted.getAddress().getStreetNumber());

        assertEquals("Brno", converted.getAddress().getCity());

        assertEquals("Karel", converted.getOwner().getFirstName());

        assertEquals("Barel", converted.getOwner().getLastName());
    }

}