package com.sree.service;

import com.sree.dao.Customer;
import com.sree.dao.CustomerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveService {

    @Autowired
    private CustomerData customerData;

    public void save(Customer customer) {
        customerData.save (customer);
    }
}
