package com.kedar.springboot.controller;

import com.kedar.springboot.domain.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class DataAccessController {

    private final AtomicLong counter = new AtomicLong();

    private static final String template = "Hello, %s!";

    @GetMapping("/hello-world")
    @ResponseBody
    public Employee getEmployee(@RequestParam(required = false, name = "name", defaultValue = "Stranger") String name){

        return new Employee(counter.incrementAndGet(), String.format(template, name));
    }


}
