package com.jescompany.pizzeria.orders.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jescompany.pizzeria.orders.domain.entity.pkpivot.OrderItemId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_pizza")
@IdClass(OrderItemId.class)
@Getter
@Setter
@NoArgsConstructor
public class OrderPizzaEntity {
    @Id
    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Id
    @Column(name = "pizza_id", nullable = false)
    private Long pizzaId;

    @Column(nullable = false, columnDefinition = "DECIMAL(2,1)")
    private Double quantity;

    @Column(nullable = false, columnDefinition = "DECIMAL(5,2)")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable = false, updatable = false)
    @JsonIgnore
    private OrderEntity order;

    @OneToOne
    @JoinColumn(name = "pizza_id", referencedColumnName = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;
}
