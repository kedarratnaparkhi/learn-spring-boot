package com.kedar.springboot.controller;

import com.google.gson.Gson;
import com.kedar.springboot.bean.Sample;
import com.kedar.springboot.domain.Customers;
import com.kedar.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerController {

    private CustomerService customerService;
    private Sample sample;

// Constructor Dependency Injection
//    @Autowired
//    public CustomerController(CustomerService customerService, Sample sample){
//        this.customerService = customerService;
//        this.sample = sample;
//    }


// Setter Dependency Injection
//    @Autowired
//    public void setSample(Sample sample){
//        this.sample = sample;
//    }

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

    @GetMapping("/sample")
    public String getAutowiredValue(){
        return sample.toString();
    }
}
