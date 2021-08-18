package com.kedar.java8features;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class TestOptionalsAPI {



    @Test
    public void testBasics(){
        Optional<String> opt = Optional.ofNullable("kedar");


        String value = opt
           .map(val -> val.toUpperCase())
           .orElseGet(() -> "DEFAULT");

    //opt.ifPresent(val -> System.out.println("value is: "+val));
        System.out.println(value);
    }
}
