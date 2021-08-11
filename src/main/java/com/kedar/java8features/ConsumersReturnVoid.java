package com.kedar.java8features;

import com.kedar.java8features.extras.Person;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumersReturnVoid {

    public static void main(String[] args) {
        //Consumer with only one input parameter
        Consumer<Person> greetMessage = person -> {System.out.println("Hello " + person.getName());};
        greetMessage.accept(new Person("kedar R", Person.Gender.MALE, 123L));

        //BiConsumer with two input parameters
        BiConsumer<Person, Boolean> greetMessageV2 =
                (person, display) -> {System.out.println("Hello "+ person.getName()+" with number "+(display ? person.getNumber() : "*****\n"));};

        greetMessageV2.accept(new Person("kedar R", Person.Gender.MALE, 987654311L), true);
        greetMessageV2.accept(new Person("John D", Person.Gender.MALE, 998876565L), false);
    }

}
