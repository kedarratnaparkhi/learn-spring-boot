package com.kedar.java8features;

import java.util.function.BiFunction;
import java.util.function.Function;


// Learned from tutorial: https://www.youtube.com/watch?v=VRpHdSFWGPs

public class FunctionsReturnValue {

    public static void main(String[] args) {

        //Functions
        Function<Integer, Integer> addOne = number -> number + 1;
        System.out.println("Add function o/p:"+addOne.apply(1)+"\n");

        Function<Integer, Integer> multiplyBy = number -> number * 10;
        System.out.println("Multiply function o/p:"+multiplyBy.apply(2));

        Function<Integer, Integer> combineFunctions = addOne.andThen(multiplyBy);
        System.out.println("Combine function o/p:"+combineFunctions.apply(2));

        //BIfunctions
        BiFunction<Integer, Integer, Double> addNumbers = (number1, number2) -> Double.valueOf(number1+number2);
        System.out.println("Bifunction addition o/p:"+addNumbers.apply(2, 2));

    }
}
