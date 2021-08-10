package com.kedar.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonLambdaExpressions {

    public static void main(String[] args){
        List<Person> persons = Arrays.asList(new Person("Kedar", Person.Gender.MALE),
                new Person("Aisha", Person.Gender.FEMALE),
                new Person("John", Person.Gender.MALE),
                new Person("Kelly", Person.Gender.FEMALE),
                new Person("Frank", Person.Gender.MALE));

        List<Person> females = new ArrayList<>();
        for(Person p: persons){
            if(p.gender.equals(Person.Gender.FEMALE)){
                females.add(p);
            }
        }

        for(Person p: females){
            System.out.println(p.toString());
        }
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
