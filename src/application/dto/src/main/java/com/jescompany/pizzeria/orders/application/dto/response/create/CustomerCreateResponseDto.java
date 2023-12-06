package com.jescompany.pizzeria.orders.application.dto.response.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerCreateResponseDto {
    private Long id;
    private String identificationNumber;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
}