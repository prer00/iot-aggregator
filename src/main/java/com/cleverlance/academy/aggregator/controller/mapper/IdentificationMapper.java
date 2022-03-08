package com.cleverlance.academy.aggregator.controller.mapper;

import org.mapstruct.Mapping;
import org.openapitools.model.Address;
import org.openapitools.model.Identification;
import org.mapstruct.Mapper;

@Mapper
public interface IdentificationMapper {

    Identification toIdentifiaction(com.cleverlance.academy.aggregator.model.Identification identification);

    @Mapping(target = "streetNumber", source = "number")
    Address toAddress(com.cleverlance.academy.aggregator.model.Address address);

}
