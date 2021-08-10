package com.kedar.java8features;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumers {

    public static void main(String[] args) {
        //Consumer with only one input parameter
        Consumer<Person> greetMessage = person -> {System.out.println("Hello " + person.name);};
        greetMessage.accept(new Person("kedar R", Person.Gender.MALE, 123L));

        //BiConsumer with two input parameters
        BiConsumer<Person, Boolean> greetMessageV2 = (person, display) -> {System.out.println("Hello "+ person.name+" with number "+(display ? person.number : "*****\n"));};

        greetMessageV2.accept(new Person("kedar R", Person.Gender.MALE, 987654311L), true);
        greetMessageV2.accept(new Person("John D", Person.Gender.MALE, 998876565L), false);
    }

    static class Person{
        private final String name;
        private final Gender gender;
        private final Long number;

        Person(String name, Gender gender, Long number){
            this.name = name;
            this.gender = gender;
            this.number = number;
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
