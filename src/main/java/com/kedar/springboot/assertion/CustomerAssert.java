package com.kedar.springboot.assertion;

import com.kedar.springboot.domain.Customers;
import com.kedar.springboot.repository.CustomerRepository;
import org.assertj.core.api.AbstractAssert;

public class CustomerAssert extends AbstractAssert<CustomerAssert, Customers> {

    private CustomerRepository customerRepository;
    private Customers cust;

    public CustomerAssert(Customers cust, CustomerRepository customerRepository){
        super(cust, CustomerAssert.class);
        this.customerRepository = customerRepository;
        this.cust = cust;
    }

    public static CustomerAssert assertThat(Customers cust, CustomerRepository customerRepository){
        return new CustomerAssert(cust, customerRepository);
    }

    public CustomerAssert isUniqueName(){
        isNotNull();
        //System.out.println("----->"+customerRepository.findByFirstNameAndLastName(cust.getFirstName(), cust.getLastName()).get(0).getId());
        if(customerRepository.findByFirstNameAndLastName(cust.getFirstName(), cust.getLastName()).size() > 0){
            failWithMessage("Uniqueness of First name and Last name combination failed");
        };
        return this;
    }


}
