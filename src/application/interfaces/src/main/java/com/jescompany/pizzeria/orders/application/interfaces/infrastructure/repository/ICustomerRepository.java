package com.jescompany.pizzeria.orders.application.interfaces.infrastructure.repository;

import com.jescompany.pizzeria.orders.domain.entity.CustomerEntity;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository {
    CustomerEntity findByPhone(@Param("phone") String phone);
}