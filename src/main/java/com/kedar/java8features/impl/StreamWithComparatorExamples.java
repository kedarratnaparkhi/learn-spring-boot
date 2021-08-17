package com.kedar.java8features.impl;

import com.kedar.java8features.extras.Employee;

import java.util.List;

public class StreamWithComparatorExamples {

    public static void main(String[] args) {
        // learned from tutorial:
        // https://java2blog.com/java-8-stream/

        List<Employee> employeeList = Employee.listOfEmployees;

        // exercise: peek with comparator example
        System.out.println("---->>> exercise 5:\n");
        employeeList.stream()
                .filter(e-> e.getAge()>30)
                .peek(e -> System.out.println("current value: "+ e))
                .sorted()
                .peek(e -> System.out.println("current value after sorted: "+ e))
                .forEach(System.out::println);
    }
}
