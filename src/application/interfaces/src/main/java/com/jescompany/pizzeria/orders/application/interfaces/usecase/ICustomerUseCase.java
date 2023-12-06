package com.jescompany.pizzeria.orders.application.interfaces.usecase;

import com.jescompany.pizzeria.orders.application.dto.response.create.CustomerCreateResponseDto;

public interface ICustomerUseCase {
    CustomerCreateResponseDto findByPhone(String phone);
}