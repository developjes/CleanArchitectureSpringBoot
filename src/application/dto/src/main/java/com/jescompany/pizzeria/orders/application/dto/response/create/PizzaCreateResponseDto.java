package com.jescompany.pizzeria.orders.application.dto.response.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaCreateResponseDto {
    private long id;
    private String name;
    private String description;
    private double price;
    private boolean vegetarian;
    private boolean vegan;
    private boolean available;
}