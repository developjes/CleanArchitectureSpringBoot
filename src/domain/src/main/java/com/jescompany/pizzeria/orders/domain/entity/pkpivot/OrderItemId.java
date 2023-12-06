package com.jescompany.pizzeria.orders.domain.entity.pkpivot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemId implements Serializable {

    private Long orderId;
    private Long pizzaId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemId that)) return false;
        return Objects.equals(orderId, that.orderId) && Objects.equals(pizzaId, that.pizzaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, pizzaId);
    }
}