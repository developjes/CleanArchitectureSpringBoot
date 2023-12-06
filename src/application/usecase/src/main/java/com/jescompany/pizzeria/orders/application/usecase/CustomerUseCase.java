package com.jescompany.pizzeria.orders.application.usecase;

import com.jescompany.pizzeria.orders.application.dto.response.create.CustomerCreateResponseDto;
import com.jescompany.pizzeria.orders.application.interfaces.infrastructure.repository.ICustomerRepository;
import com.jescompany.pizzeria.orders.application.interfaces.usecase.ICustomerUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerUseCase implements ICustomerUseCase {

    public final ICustomerRepository customerRepository;

    @Autowired
    public CustomerUseCase(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerCreateResponseDto findByPhone(String phone) {
        return null;
    }
}