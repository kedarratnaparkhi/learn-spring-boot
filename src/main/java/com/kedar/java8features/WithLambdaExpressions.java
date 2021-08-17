package com.kedar.java8features;

import com.kedar.java8features.extras.Person;
import java.util.List;
import java.util.stream.Collectors;

// Learned from tutorial: https://www.youtube.com/watch?v=VRpHdSFWGPs

public class WithLambdaExpressions {

    public static void main(String[] args) {
        List<Person> females = Person.persons.stream()
                .filter(person -> Person.Gender.MALE.equals(person.getGender()))
                .collect(Collectors.toList());

        females.forEach(System.out::println);

    }
}
