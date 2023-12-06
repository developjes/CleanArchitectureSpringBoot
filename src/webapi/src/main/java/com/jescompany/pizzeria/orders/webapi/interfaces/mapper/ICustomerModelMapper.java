package com.jescompany.pizzeria.orders.webapi.interfaces.mapper;

import com.jescompany.pizzeria.orders.application.dto.request.create.CustomerCreateRequestDto;
import com.jescompany.pizzeria.orders.application.dto.response.create.CustomerCreateResponseDto;
import com.jescompany.pizzeria.orders.webapi.model.request.create.CustomerCretaeRequestModel;
import com.jescompany.pizzeria.orders.webapi.model.response.update.CustomerCreateResponseModel;

public interface ICustomerModelMapper {
    CustomerCreateRequestDto convertToCustomerRequestDto(CustomerCretaeRequestModel customer);
    CustomerCreateResponseModel convertToCustomerResponseModel(CustomerCreateResponseDto customer);
}