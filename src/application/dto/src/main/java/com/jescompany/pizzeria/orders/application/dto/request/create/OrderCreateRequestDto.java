package com.jescompany.pizzeria.orders.application.dto.request.create;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class OrderCreateRequestDto {
    private LocalDateTime date;
    private Double total;
    private String method;
    private String additionalNotes;
    private String customerId;
}