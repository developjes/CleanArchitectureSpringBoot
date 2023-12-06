package com.jescompany.pizzeria.orders.webapi.interfaces.mapper.rules;

import com.jescompany.pizzeria.orders.application.dto.request.create.CustomerCreateRequestDto;
import com.jescompany.pizzeria.orders.application.dto.response.create.CustomerCreateResponseDto;
import com.jescompany.pizzeria.orders.webapi.model.request.create.CustomerCretaeRequestModel;
import com.jescompany.pizzeria.orders.webapi.model.response.update.CustomerCreateResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ICustomerModelRuleMapper {
    @Mapping(source = "name", target = "name")
    @Mapping(source = "identificationNumber", target = "identificationNumber")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    CustomerCreateRequestDto convertToCustomerRequestDto(CustomerCretaeRequestModel customer);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "identificationNumber", target = "identificationNumber")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    CustomerCreateResponseModel convertToCustomerResponseModel(CustomerCreateResponseDto customer);
}