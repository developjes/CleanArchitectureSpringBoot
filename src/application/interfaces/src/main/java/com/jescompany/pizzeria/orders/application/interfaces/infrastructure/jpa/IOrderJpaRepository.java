package com.jescompany.pizzeria.orders.application.interfaces.infrastructure.jpa;

import com.jescompany.pizzeria.orders.application.interfaces.infrastructure.projection.IOrderSummary;
import com.jescompany.pizzeria.orders.domain.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface IOrderJpaRepository extends JpaRepository<OrderEntity, Long> {

    List<OrderEntity> findAllByDateAfter(LocalDateTime date);

    List<OrderEntity> findAllByMethodIn(List<String> methods);

    @Query(value = "SELECT * FROM order_pizza WHERE customer_id = :id", nativeQuery = true)
    List<OrderEntity> findCustomerOrders(@Param("id") String idCustomer);

    @Query(value =
            "SELECT  po.order_id AS orderId, cu.name AS customerName, po.date AS orderDate," +
                " po.total AS orderTotal, GROUP_CONCAT(pi.name) AS pizzaNames " +
                "FROM order_pizza po  " +
                "   INNER JOIN customer cu ON po.customer_id = cu.customer_id  " +
                "   INNER JOIN order_item oi ON po.id_order = oi.id_order  " +
                "   INNER JOIN pizza pi ON oi.id_pizza = pi.id_pizza  " +
                "WHERE  po.id_order = :orderId " +
                "GROUP BY po.id_order, cu.name, po.date, po.total", nativeQuery = true)
    IOrderSummary findSummary(@Param("orderId") int orderId);

    @Procedure(value = "take_random_pizza_order", outputParameterName = "order_taken")
    boolean saveRandomOrder(@Param("customer_id") String idCustomer, @Param("method") String method);
}