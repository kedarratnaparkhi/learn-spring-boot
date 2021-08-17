package com.kedar.java8features.impl;

import com.kedar.java8features.extras.Employee;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;


// learned from tutorial:
// https://java2blog.com/java-8-stream/

public class StreamWithFilterExamples {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.listOfEmployees;

        // exercise: find all the employees whose age is greater than 30 and print the employee names
        employeeList.stream()
                    .filter(emp -> emp.getAge()>30)
                    .map(emp -> emp.getName())
                    .collect(Collectors.toList())
                    .forEach(System.out::println);

        // exercise: find the count of employees with age greater than 25
        System.out.println(employeeList
                            .stream()
                            .filter(person -> person.getAge() > 25)
                            .count());


        // exercise: find the employee whose name is John
        employeeList.stream()
                    .filter(emp -> emp.getName().equals("John"))
                    .forEach(System.out::println);

    }
}
