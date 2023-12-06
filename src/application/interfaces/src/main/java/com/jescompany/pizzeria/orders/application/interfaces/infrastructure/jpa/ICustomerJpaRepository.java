package com.jescompany.pizzeria.orders.application.interfaces.infrastructure.jpa;

import com.jescompany.pizzeria.orders.domain.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerJpaRepository extends JpaRepository<CustomerEntity, Long> {

    @Query(value = "SELECT c FROM CustomerEntity c WHERE c.phoneNumber = :phone")
    CustomerEntity findByPhone(@Param("phone") String phone);
}