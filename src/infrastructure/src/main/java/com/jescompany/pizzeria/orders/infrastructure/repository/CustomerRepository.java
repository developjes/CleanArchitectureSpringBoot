package com.jescompany.pizzeria.orders.infrastructure.repository;

import com.jescompany.pizzeria.orders.application.interfaces.infrastructure.jpa.ICustomerJpaRepository;
import com.jescompany.pizzeria.orders.application.interfaces.infrastructure.repository.ICustomerRepository;
import com.jescompany.pizzeria.orders.domain.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerRepository implements ICustomerRepository {

    private final ICustomerJpaRepository customerJpaRepository;

    @Autowired
    public CustomerRepository(ICustomerJpaRepository customerJpaRepository) {
        this.customerJpaRepository = customerJpaRepository;
    }

    @Override
    public CustomerEntity findByPhone(String phone) {
        return customerJpaRepository.findByPhone(phone);
    }
}