package com.kedar.springboot.service;

import com.kedar.springboot.domain.Customers;
import com.kedar.springboot.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    CustomerRepository repository;

    public CustomerService(CustomerRepository customerRepository){
        this.repository = customerRepository;
    }

    public Long saveCustomer(Customers customer) throws Exception {
        if(!repository.findByFirstName(customer.getFirstName()).isEmpty()){
            throw new Exception("Customer with firstname already exists");
        }else
            return repository.save(customer).getId();
    }

    public List<Customers> getCustomer(String firstName){
        return repository.findByFirstName(firstName);
    }
}
