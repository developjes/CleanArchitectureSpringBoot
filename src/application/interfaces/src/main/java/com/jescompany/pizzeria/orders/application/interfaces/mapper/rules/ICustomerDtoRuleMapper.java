package com.jescompany.pizzeria.orders.application.interfaces.mapper.rules;

import com.jescompany.pizzeria.orders.application.dto.request.create.CustomerCreateRequestDto;
import com.jescompany.pizzeria.orders.application.dto.response.create.CustomerCreateResponseDto;
import com.jescompany.pizzeria.orders.domain.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ICustomerDtoRuleMapper {

    @Mapping(target = "id", constant = "0L")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "identificationNumber", target = "identificationNumber")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    CustomerEntity convertToCustomerEntity(CustomerCreateRequestDto newCustomer);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "identificationNumber", target = "identificationNumber")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    CustomerCreateResponseDto convertToCustomerResponseDto(CustomerEntity customer);
}