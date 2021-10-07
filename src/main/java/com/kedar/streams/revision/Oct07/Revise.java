package com.kedar.streams.revision.Oct07;

import com.kedar.java8features.extras.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Revise {

    public static void main(String[] args) {
        List<Employee> employees = Employee.listOfEmployees;
//        runMaptoXXX(employees);
//        runMapToObj(employees);
        runAndThen(employees);

    }


    static void runMaptoXXX(List<Employee> employees){
        List<Integer> empAges = new ArrayList<>();

        employees.stream().mapToInt(employee -> employee.getAge()).forEach(age-> empAges.add(age));
        System.out.println(empAges);
    }

    static void runMapToObj(List<Employee> employees){
        List<Employee> newEMpl = employees.stream()
                .mapToInt(employee -> employee.getAge())
                .mapToObj(age -> new Employee("", age, new ArrayList<>()))
                .collect(Collectors.toList());
        System.out.println(newEMpl);
    }

    static void runAndThen(List<Employee> employees){

        Function<Employee, List<String>> firstFunc = employee -> employee.getListOfCities();
        Function<List<String>, String> secondFunc = cities -> cities.get(1);

        employees.stream().map(firstFunc.andThen(secondFunc)).forEach(System.out::println);

    }


}
