package com.jescompany.pizzeria.orders.application.interfaces.infrastructure.repository;

import com.jescompany.pizzeria.orders.domain.entity.PizzaEntity;

import java.util.List;
import java.util.Optional;

public interface IPizzaRepository {

    List<PizzaEntity> findAllByAvailableTrueOrderByPrice();

    Optional<PizzaEntity> findFirstByAvailableTrueAndNameIgnoreCase(String name);

    List<PizzaEntity> findAllByAvailableTrueAndDescriptionContainingIgnoreCase(String description);

    List<PizzaEntity> findAllByAvailableTrueAndDescriptionNotContainingIgnoreCase(String description);

    List<PizzaEntity> findTop3ByAvailableTrueAndPriceLessThanEqualOrderByPriceAsc(double price);

    int countByVeganTrue();
}