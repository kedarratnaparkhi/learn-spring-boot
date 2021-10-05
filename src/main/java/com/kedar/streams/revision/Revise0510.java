package com.kedar.streams.revision;

import com.kedar.java8features.extras.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Revise0510 {

    public static void main(String[] args) {
        List<Employee> employees = Employee.listOfEmployees;
        //runFindAny(employees);
        //runForEach(employees);
        //runCollect(employees);
    }

    private static void runFindAny(List<Employee> employees){
        Optional<Employee> emp1 = employees.stream().filter(employee -> employee.getAge() == 24).findAny();

        System.out.println(emp1.get());
    }

    private static void runForEach(List<Employee> employees){

        List<String> employeeNames = new ArrayList<>();
        employees.forEach(employee -> employeeNames.add(employee.getName()));
        System.out.println("Before: "+employeeNames);

        List<String> upperCaseNames = new ArrayList<>();
        employees.stream().map(employee -> employee.getName()).forEach(name -> upperCaseNames.add(name.toUpperCase()));
        System.out.println("After: "+upperCaseNames);

        List<String> otherList = new ArrayList<>();
        employees.stream().forEach(employee -> otherList.add(employee.getName()));
        System.out.println("Other List: "+otherList);


    }

    private static void runCollect(List<Employee> employees){
        Map<String, Integer> ageList = employees.stream().collect(Collectors.toMap(employee-> employee.getName(), employee->employee.getAge()));
        System.out.println(ageList);

    }
}
