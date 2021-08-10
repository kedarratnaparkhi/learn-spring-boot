package com.kedar.springboot;

//import com.kedar.springboot.domain.Customers;
//import com.kedar.springboot.domain.Orders;
//import com.kedar.springboot.repository.CustomerRepository;
//import com.kedar.springboot.repository.OrderRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import org.slf4j.Logger;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EntityScan
public class SpringBootLearnApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBootLearnApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearnApplication.class, args);
    }


//    @Bean
//    public CommandLineRunner demo(CustomerRepository customerRepository, OrderRepository orderRepository){
//
//        return(args) -> {
//            //			Orders ord = new Orders(1L);
//            //			Set<Orders> orders = new HashSet<>();
//            //			orders.add(ord);
//            //
//            //			orderRepository.save(ord);
//            //			customerRepository.save(new Customers("Kedar", "Ratnaparkhi", orders));
//            //			customerRepository.save(new Customers("Sam", "Ram"));
//            //			customerRepository.save(new Customers("Jack", "Bauer"));
//            //			customerRepository.save(new Customers("Chloe", "O'Brian"));
//            //			customerRepository.save(new Customers("Kim", "Bauer"));
//            //			customerRepository.save(new Customers("David", "Palmer"));
//            //			customerRepository.save(new Customers("Michelle", "Dessler"));
//            //
//            //			for(Customers cust: customerRepository.findByFirstName("Kedar")){
//            //				log.info(cust.toString());
//            //			}
//        };
//    }
}
