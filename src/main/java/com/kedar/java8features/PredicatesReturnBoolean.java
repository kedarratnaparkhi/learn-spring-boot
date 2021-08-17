package com.kedar.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

// Learned from tutorial: https://www.youtube.com/watch?v=VRpHdSFWGPs

public class PredicatesReturnBoolean {

    static List<String> phoneNumbers = Arrays.asList("8923*****", "08923*****", "087458*****", "0877******");

    public static void main(String[] args) {
        //Test individually
        System.out.println(isPhoneNumberValid("8923*****"));
        System.out.println(isPhoneNumberValid.test("0892361353"));

        //using predicates with Stream API
        phoneNumbers.stream().filter(isPhoneNumberValid).forEach(System.out::println);

        //using BiPredicates
        System.out.println(isPhoneNumberValidV2.test("08920*****", 10));
    }

    //Normal Function
    private static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("08") && phoneNumber.length() == 10;
    }

    //Functional Interface with Predicate
    static Predicate<String> isPhoneNumberValid = phoneNumber -> phoneNumber.startsWith("089") && phoneNumber.length() == 10;

    //Functional Interface with BiPredicate
    static BiPredicate<String, Integer> isPhoneNumberValidV2 = (phoneNumber, leng) -> phoneNumber.startsWith("08") && phoneNumber.length() == leng;


}
