package com.kedar.springboot.repository;

import com.kedar.springboot.domain.Customers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customers, Long> {

    List<Customers> findAll();

    List<Customers> findByFirstName(String firstName);

    List<Customers> findByFirstNameAndLastName(String firstName, String lastName);


}
