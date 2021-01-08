package com.amrindersingh.brewery.services;

import com.amrindersingh.brewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    public CustomerDTO getCustomerById(UUID id);

    CustomerDTO saveNewCustomer(CustomerDTO customerDTO);
}
