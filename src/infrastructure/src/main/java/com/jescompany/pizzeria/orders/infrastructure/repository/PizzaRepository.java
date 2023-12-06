package com.jescompany.pizzeria.orders.infrastructure.repository;

import com.jescompany.pizzeria.orders.application.interfaces.infrastructure.jpa.IPizzaJpaRepository;
import com.jescompany.pizzeria.orders.application.interfaces.infrastructure.repository.IPizzaRepository;
import com.jescompany.pizzeria.orders.domain.entity.PizzaEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PizzaRepository implements IPizzaRepository {

    private final IPizzaJpaRepository pizzaJpaRepository;

    @Autowired
    public PizzaRepository(IPizzaJpaRepository pizzaJpaRepository) {
        this.pizzaJpaRepository = pizzaJpaRepository;
    }

    @Override
    public List<PizzaEntity> findAllByAvailableTrueOrderByPrice() {
        return pizzaJpaRepository.findAllByAvailableTrueOrderByPrice();
    }

    @Override
    public Optional<PizzaEntity> findFirstByAvailableTrueAndNameIgnoreCase(String name) {
        return pizzaJpaRepository.findFirstByAvailableTrueAndNameIgnoreCase(name);
    }

    @Override
    public List<PizzaEntity> findAllByAvailableTrueAndDescriptionContainingIgnoreCase(String description) {
        return pizzaJpaRepository.findAllByAvailableTrueAndDescriptionContainingIgnoreCase(description);
    }

    @Override
    public List<PizzaEntity> findAllByAvailableTrueAndDescriptionNotContainingIgnoreCase(String description) {
        return pizzaJpaRepository.findAllByAvailableTrueAndDescriptionNotContainingIgnoreCase(description);
    }

    @Override
    public List<PizzaEntity> findTop3ByAvailableTrueAndPriceLessThanEqualOrderByPriceAsc(double price) {
        return pizzaJpaRepository.findTop3ByAvailableTrueAndPriceLessThanEqualOrderByPriceAsc(price);
    }

    @Override
    public int countByVeganTrue() {
        return pizzaJpaRepository.countByVeganTrue();
    }
}