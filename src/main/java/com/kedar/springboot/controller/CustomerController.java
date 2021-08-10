package com.kedar.springboot.controller;

import com.google.gson.Gson;
import com.kedar.springboot.domain.Customers;
import com.kedar.springboot.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }


    @GetMapping("/customer/{firstName}")
    @ResponseBody
    public List<Customers> getCustomer(@PathVariable String firstName){
        return customerService.getCustomer(firstName);
    }

    @PostMapping("/addCustomer")
    public Long saveCustomer(@RequestBody String customerData) throws Exception {
        Gson gson = new Gson();
        Customers cust = gson.fromJson(customerData, Customers.class);
        //orderRepository.saveAll(cust.getOrders());
        return customerService.saveCustomer(cust);
    }
}
