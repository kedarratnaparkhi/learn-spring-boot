package com.kedar.java8features.impl;

import com.kedar.java8features.extras.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWithMapExamples {

    public static void main(String[] args) {
        // learned from tutorial:
        // https://java2blog.com/java-8-stream/

        List<Employee> employeeList = Employee.listOfEmployees;

        List<String> animals  = Arrays.asList("Monkey", "Lion", "Giraffe", "Lemur", "Lion");

        // exercise: get max age of employee
        System.out.println("---->>> exercise 4:\n");
        OptionalInt maxAge = employeeList.stream()
                .mapToInt(emp -> emp.getAge())
                .max();

        System.out.println("Max age: "+maxAge.getAsInt());

        // Learned from:
        // https://dzone.com/articles/become-a-master-of-java-streams-part-1-creating-st
        // https://dzone.com/articles/become-a-master-of-java-streams-part-2-intermediat
        // https://dzone.com/articles/become-a-master-of-java-streams-part-3-terminal-op
        //


        System.out.println("---->>> exercise 5:\n");

        Stream.of("Monkey", "Lion", "Giraffe", "Lemur", "Lion").
                flatMap(s-> s.chars().mapToObj(i->(char)i)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Collect Operations: ---->\n");
        List<String> op1 = animals.stream()
                                  .collect(Collectors.toList());

        System.out.println("op1: "+op1);

        Set<String> op2 = animals.stream()
                .collect(Collectors.toSet());

        System.out.println("op2: "+op2);

        String[] op3 = animals.stream()
                .toArray(value -> new String[value]);

        System.out.println("op3: "+op3.toString());


        Map<String, Integer> op4 = animals.stream()
                                          .distinct()
                                          .collect(Collectors.toMap(
                                                  Function.identity(),
                                                  s -> (int)s.chars().count()
                                          ));

        System.out.println("op4: "+op4);

    }
}
