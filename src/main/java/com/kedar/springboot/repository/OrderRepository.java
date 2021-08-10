package com.kedar.springboot.repository;

import com.kedar.springboot.domain.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, Long> {
}
