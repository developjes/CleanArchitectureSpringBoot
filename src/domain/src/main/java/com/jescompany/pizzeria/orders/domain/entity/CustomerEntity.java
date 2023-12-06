package com.jescompany.pizzeria.orders.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long id;

    @Column(name = "identification_number", nullable = false, unique = true, length = 15)
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String identificationNumber;

    @Column(nullable = false, length = 60)
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String name;

    @Column(length = 100)
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String address;

    @Column(nullable = false, length = 50, unique = true)
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String email;

    @Column(name = "phone_number", length = 20)
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String phoneNumber;
}