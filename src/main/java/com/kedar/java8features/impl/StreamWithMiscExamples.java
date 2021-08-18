package com.kedar.java8features.impl;

import com.kedar.java8features.extras.Employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamWithMiscExamples {

    public static void main(String[] args) {
        // learned from tutorial:
        // https://java2blog.com/java-8-stream/
        // https://mkyong.com/java8/java-8-stream-reduce-examples/



        IntStream intStream = IntStream.of(1,2,3,4,5);
        int sum = intStream.reduce(0, (a, b)-> a+b);
        System.out.println(sum);

        List<String> employeeNameList = Employee.listOfEmployees.stream()
                                                                .map(emp -> emp.getName())
                                                                .collect(Collectors.toList());
        System.out.println(employeeNameList);
        String employeeNameLongString = Employee.listOfEmployees.stream()
                .map(emp -> emp.getName())
                .reduce("", (a,b) -> a+b);
        System.out.println(employeeNameLongString);
    }
}
