package com.jescompany.pizzeria.orders.domain.entity;

import com.jescompany.pizzeria.orders.domain.entity.audit.AuditBaseEntity;
import com.jescompany.pizzeria.orders.domain.entity.audit.listener.AuditPizzaListener;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;

@Entity
@Table(name = "pizza")
@EntityListeners({AuditingEntityListener.class, AuditPizzaListener.class})
@Getter
@Setter
@NoArgsConstructor
public class PizzaEntity extends AuditBaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_id", nullable = false)
    private Long pizzaId;

    @Column(nullable = false, length = 30, unique = true)
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String name;

    @Column(nullable = false, length = 150)
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String description;

    @Column(nullable = false)
    @JdbcTypeCode(SqlTypes.DECIMAL)
    private Double price;

    @Column(nullable = false)
    @JdbcTypeCode(SqlTypes.BOOLEAN)
    private Boolean vegetarian;

    @Column(nullable = false)
    @JdbcTypeCode(SqlTypes.BOOLEAN)
    private Boolean vegan;

    @Column(nullable = false)
    @JdbcTypeCode(SqlTypes.BOOLEAN)
    private Boolean available;

    @Override
    public String toString() {
        return "PizzaEntity {" +
                "idPizza = " + pizzaId +
                ", name = '" + name + '\'' +
                ", description = '" + description + '\'' +
                ", price = " + price +
                ", vegetarian = " + vegetarian +
                ", vegan = " + vegan +
                ", available = " + available +
            '}';
    }
}
