package com.jescompany.pizzeria.orders.webapi.mapper;

import com.jescompany.pizzeria.orders.application.dto.request.create.CustomerCreateRequestDto;
import com.jescompany.pizzeria.orders.application.dto.response.create.CustomerCreateResponseDto;
import com.jescompany.pizzeria.orders.webapi.interfaces.mapper.ICustomerModelMapper;
import com.jescompany.pizzeria.orders.webapi.interfaces.mapper.rules.ICustomerModelRuleMapper;
import com.jescompany.pizzeria.orders.webapi.model.request.create.CustomerCretaeRequestModel;
import com.jescompany.pizzeria.orders.webapi.model.response.update.CustomerCreateResponseModel;

public class CustomerModelMapper implements ICustomerModelMapper {

    private final ICustomerModelRuleMapper customerModelRuleMapper;

    public CustomerModelMapper(ICustomerModelRuleMapper customerModelRuleMapper) {
        this.customerModelRuleMapper = customerModelRuleMapper;
    }

    @Override
    public CustomerCreateRequestDto convertToCustomerRequestDto(CustomerCretaeRequestModel customer) {
        return customerModelRuleMapper.convertToCustomerRequestDto(customer);
    }

    @Override
    public CustomerCreateResponseModel convertToCustomerResponseModel(CustomerCreateResponseDto customer) {
        return customerModelRuleMapper.convertToCustomerResponseModel(customer);
    }
}