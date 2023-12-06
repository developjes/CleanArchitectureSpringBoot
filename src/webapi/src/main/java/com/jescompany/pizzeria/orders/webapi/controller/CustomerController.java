package com.jescompany.pizzeria.orders.webapi.controller;

import com.jescompany.pizzeria.orders.application.interfaces.usecase.ICustomerUseCase;
import com.jescompany.pizzeria.orders.webapi.interfaces.mapper.ICustomerModelMapper;
import com.jescompany.pizzeria.orders.webapi.model.response.update.CustomerCreateResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final ICustomerUseCase customerUseCase;
    private final ICustomerModelMapper customerModelMapper;

    @Autowired
    public CustomerController(ICustomerUseCase customerUseCase, ICustomerModelMapper customerModelMapper) {
        this.customerUseCase = customerUseCase;
        this.customerModelMapper = customerModelMapper;
    }

    @GetMapping("/phone/{phone}")
    public ResponseEntity<CustomerCreateResponseModel> getByPhone(@PathVariable String phone) {
        CustomerCreateResponseModel customer = customerModelMapper.convertToCustomerResponseModel(
                customerUseCase.findByPhone(phone)
        );
        return ResponseEntity.ok(customer);
    }
}

// martines luis gabriel - luis-gabriel.martines@capgemini.com