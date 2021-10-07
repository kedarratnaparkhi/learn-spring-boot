package com.kedar.streams.revision.Oct07;

import com.kedar.java8features.extras.Employee;

import java.util.List;
import java.util.function.*;

public class ReviseCustomFunctions {

    public static void main(String[] args) {
        List<Employee> employees = Employee.listOfEmployees;

        runCustomFunction(employees);
        runCustomPredicate(employees);
        runCustomConsumer(employees);
        runCustomSupplier(employees);

    }


    static void runCustomFunction(List<Employee> employees){

        Function<Employee, String> convertoToUpperCase = (employee) -> employee.getName().toUpperCase();

        //Before
        employees.stream().map(employee -> employee.getName()).forEach(System.out::println);

        //After
        employees.stream().map(convertoToUpperCase).forEach(System.out::println);

        //BiFunction example
        BiFunction<String, String, String> simpleBiFunction = (first, second) -> first + second;

        System.out.println(simpleBiFunction.apply("hello ","world"));

    }

    static void runCustomPredicate(List<Employee> employees){
        Predicate<String> samplePredicate = (name) -> name.contains("kedar");

        System.out.println(samplePredicate.test("kkadkasd"));

        //Bipredicate example
        BiPredicate<String, String> areTheyEqual = (firstName, lastName) -> firstName.equals(lastName);

        System.out.println(areTheyEqual.test("kedar", "kedar"));
    }

    static void runCustomConsumer(List<Employee> employees){
        Consumer<String> customConsumer = (message) -> System.out.println(message);
        customConsumer.accept("hello world message as input");

        //Biconsumer example
        BiConsumer<String, Employee> customBiConsumer = (message, employee) -> System.out.println(message + employee.getName());
        customBiConsumer.accept("employee name is: ", employees.get(2));

    }

    static void runCustomSupplier(List<Employee> employees){
        Supplier<String> customerSupplier = () -> "hello world";

        System.out.println(customerSupplier.get());
    }
}
