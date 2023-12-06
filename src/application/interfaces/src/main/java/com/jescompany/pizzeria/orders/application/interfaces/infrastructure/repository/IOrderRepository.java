package com.jescompany.pizzeria.orders.application.interfaces.infrastructure.repository;

import com.jescompany.pizzeria.orders.application.interfaces.infrastructure.projection.IOrderSummary;
import com.jescompany.pizzeria.orders.domain.entity.OrderEntity;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface IOrderRepository {

    List<OrderEntity> findAllByDateAfter(LocalDateTime date);

    List<OrderEntity> findAllByMethodIn(List<String> methods);

    List<OrderEntity> findCustomerOrders(@Param("id") String idCustomer);

    IOrderSummary findSummary(@Param("orderId") int orderId);

    boolean saveRandomOrder(@Param("customer_id") String idCustomer, @Param("method") String method);
}
