package com.jescompany.pizzeria.orders.application.interfaces.mapper;

import com.jescompany.pizzeria.orders.application.dto.request.create.CustomerCreateRequestDto;
import com.jescompany.pizzeria.orders.application.dto.response.create.CustomerCreateResponseDto;
import com.jescompany.pizzeria.orders.domain.entity.CustomerEntity;

public interface ICustomerDtoMapper {
    CustomerEntity convertToCustomerEntity(CustomerCreateRequestDto newCustomer);
    CustomerCreateResponseDto convertToCustomerResponseDto(CustomerEntity customer);
}