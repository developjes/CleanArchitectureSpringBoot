package com.jescompany.pizzeria.orders.application.interfaces.usecase;

import com.jescompany.pizzeria.orders.application.dto.response.create.OrderCreateResponseDto;

import java.util.List;

public interface IOrderUseCase {

    List<OrderCreateResponseDto> getAll();

    List<OrderCreateResponseDto> getTodayOrders();

    List<OrderCreateResponseDto> getOutsideOrders();

    List<OrderCreateResponseDto> getCustomerOrders(long customerId);
}