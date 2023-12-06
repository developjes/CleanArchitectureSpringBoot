package com.jescompany.pizzeria.orders.application.usecase;

import com.jescompany.pizzeria.orders.application.dto.request.create.PizzaCreateRequestDto;
import com.jescompany.pizzeria.orders.application.dto.response.create.PizzaCreateResponseDto;
import com.jescompany.pizzeria.orders.application.interfaces.infrastructure.repository.IPizzaRepository;
import com.jescompany.pizzeria.orders.application.interfaces.usecase.IPizzaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class PizzaUseCase implements IPizzaUseCase {

    private final IPizzaRepository pizzaRepository;

    @Autowired
    public PizzaUseCase(IPizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @Override
    public Page<PizzaCreateResponseDto> getAll(int page, int elements) {
        Pageable pageRequest = PageRequest.of(page, elements);
        return null;
    }

    @Override
    public Page<PizzaCreateResponseDto> getAvailable(int page, int elements, String sortBy, String sortDirection) {
        return null;
    }

    @Override
    public PizzaCreateResponseDto getByName(String name) {
        return null;
    }

    @Override
    public List<PizzaCreateResponseDto> getWith(String ingredient) {
        return null;
    }

    @Override
    public List<PizzaCreateResponseDto> getWithout(String ingredient) {
        return null;
    }

    @Override
    public List<PizzaCreateResponseDto> getCheapest(double price) {
        return null;
    }

    @Override
    public PizzaCreateResponseDto get(int idPizza) {
        return null;
    }

    @Override
    public PizzaCreateResponseDto save(PizzaCreateRequestDto pizza) {
        return null;
    }

    @Override
    public void delete(int idPizza) {

    }
}