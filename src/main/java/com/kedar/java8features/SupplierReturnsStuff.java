package com.kedar.java8features;

import com.kedar.java8features.extras.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierReturnsStuff {

    public static void main(String[] args) {
        System.out.println(sampleSupplier());

        System.out.println(sampleSupplier.get());

        System.out.println(predefinedPersonsList.get());
    }

    static List<String> sampleSupplier(){
        return Arrays.asList("adasdasdasd","rqweqweqwe","vzzczc");
    }

    static Supplier<String> sampleSupplier = () -> "hello supp";

    static Supplier<List<Person>> predefinedPersonsList = () -> Arrays.asList(new Person("Kedar", Person.Gender.MALE),
                                                                            new Person("Aisha", Person.Gender.FEMALE),
                                                                            new Person("John", Person.Gender.MALE),
                                                                            new Person("Kelly", Person.Gender.FEMALE),
                                                                            new Person("Frank", Person.Gender.MALE));
}
