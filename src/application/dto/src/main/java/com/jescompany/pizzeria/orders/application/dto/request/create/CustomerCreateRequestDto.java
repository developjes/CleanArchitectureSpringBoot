package com.jescompany.pizzeria.orders.application.dto.request.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerCreateRequestDto {
    private String identificationNumber;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
}