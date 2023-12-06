package com.jescompany.pizzeria.orders.application.interfaces.usecase;

import com.jescompany.pizzeria.orders.application.dto.request.create.PizzaCreateRequestDto;
import com.jescompany.pizzeria.orders.application.dto.response.create.PizzaCreateResponseDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IPizzaUseCase {
    Page<PizzaCreateResponseDto> getAll(int page, int elements);

    Page<PizzaCreateResponseDto> getAvailable(int page, int elements, String sortBy, String sortDirection);

    PizzaCreateResponseDto getByName(String name);

    List<PizzaCreateResponseDto> getWith(String ingredient);

    List<PizzaCreateResponseDto> getWithout(String ingredient);

    List<PizzaCreateResponseDto> getCheapest(double price);

    PizzaCreateResponseDto get(int idPizza);

    PizzaCreateResponseDto save(PizzaCreateRequestDto pizza);

    void delete(int idPizza);
}