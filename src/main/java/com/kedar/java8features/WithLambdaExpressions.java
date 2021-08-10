package com.kedar.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithLambdaExpressions {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Kedar", Person.Gender.MALE),
                new Person("Aisha", Person.Gender.FEMALE),
                new Person("John", Person.Gender.MALE),
                new Person("Kelly", Person.Gender.FEMALE),
                new Person("Frank", Person.Gender.MALE));

        List<Person> females = persons.stream()
                .filter(person -> Person.Gender.MALE.equals(person.gender))
                .collect(Collectors.toList());
        //.forEach(System.out::println);

        females.forEach(System.out::println);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        enum Gender{
            MALE, FEMALE;
        }

        @Override
        public String toString(){
            return "name: "+this.name+", gender: "+this.gender;
        }

    }
}
