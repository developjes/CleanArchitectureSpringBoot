package com.jescompany.pizzeria.orders.application.usecase;

import com.jescompany.pizzeria.orders.application.dto.response.create.OrderCreateResponseDto;
import com.jescompany.pizzeria.orders.application.interfaces.infrastructure.repository.IOrderRepository;
import com.jescompany.pizzeria.orders.application.interfaces.usecase.IOrderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderUseCase implements IOrderUseCase {

    private final IOrderRepository orderRepository;

    @Autowired
    public OrderUseCase(IOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderCreateResponseDto> getAll() {
        return null;
    }

    @Override
    public List<OrderCreateResponseDto> getTodayOrders() {
        return null;
    }

    @Override
    public List<OrderCreateResponseDto> getOutsideOrders() {
        return null;
    }

    @Override
    public List<OrderCreateResponseDto> getCustomerOrders(long customerId) {
        return null;
    }
}
