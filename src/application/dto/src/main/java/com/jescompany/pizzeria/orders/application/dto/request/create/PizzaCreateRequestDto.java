package com.jescompany.pizzeria.orders.application.dto.request.create;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PizzaCreateRequestDto {
    private String name;
    private String description;
    private double price;
    private boolean vegetarian;
    private boolean vegan;
    private boolean available;
}