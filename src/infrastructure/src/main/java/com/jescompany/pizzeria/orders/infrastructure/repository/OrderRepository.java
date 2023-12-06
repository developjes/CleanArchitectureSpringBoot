package com.jescompany.pizzeria.orders.infrastructure.repository;

import com.jescompany.pizzeria.orders.application.interfaces.infrastructure.jpa.IOrderJpaRepository;
import com.jescompany.pizzeria.orders.application.interfaces.infrastructure.projection.IOrderSummary;
import com.jescompany.pizzeria.orders.application.interfaces.infrastructure.repository.IOrderRepository;
import com.jescompany.pizzeria.orders.domain.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class OrderRepository implements IOrderRepository {

    private final IOrderJpaRepository orderJpaRepository;

    @Autowired
    public OrderRepository(IOrderJpaRepository orderJpaRepository) {
        this.orderJpaRepository = orderJpaRepository;
    }

    @Override
    public List<OrderEntity> findAllByDateAfter(LocalDateTime date) {
        return orderJpaRepository.findAllByDateAfter(date);
    }

    @Override
    public List<OrderEntity> findAllByMethodIn(List<String> methods) {
        return orderJpaRepository.findAllByMethodIn(methods);
    }

    @Override
    public List<OrderEntity> findCustomerOrders(String idCustomer) {
        return orderJpaRepository.findCustomerOrders(idCustomer);
    }

    @Override
    public IOrderSummary findSummary(int orderId) {
        return orderJpaRepository.findSummary(orderId);
    }

    @Override
    public boolean saveRandomOrder(String idCustomer, String method) {
        return orderJpaRepository.saveRandomOrder(idCustomer, method);
    }
}