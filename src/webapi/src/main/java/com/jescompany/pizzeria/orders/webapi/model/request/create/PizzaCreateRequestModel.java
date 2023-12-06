package com.jescompany.pizzeria.orders.webapi.model.request.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaCreateRequestModel {
    private String name;
    private String description;
    private double price;
    private boolean vegetarian;
    private boolean vegan;
    private boolean available;
}