package com.ruoyi.project.system.customer.service.impl;

import com.ruoyi.project.system.customer.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest{
    @Autowired
    CustomerServiceImpl customerService;

    @Test
    public void insertCustomer() {
        Customer customer=new Customer();
        customer.setName("客户1");
        customer.setCustomerType(1L);
        customer.setAvailable(1L);
        customerService.insertCustomer(customer);
    }
}