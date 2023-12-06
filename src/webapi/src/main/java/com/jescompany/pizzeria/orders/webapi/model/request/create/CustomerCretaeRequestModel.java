package com.jescompany.pizzeria.orders.webapi.model.request.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerCretaeRequestModel {
    private String identificationNumber;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
}