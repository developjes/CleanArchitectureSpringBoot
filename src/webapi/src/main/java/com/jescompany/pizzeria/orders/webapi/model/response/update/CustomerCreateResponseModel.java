package com.jescompany.pizzeria.orders.webapi.model.response.update;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerCreateResponseModel {
    private Long id;
    private String identificationNumber;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
}