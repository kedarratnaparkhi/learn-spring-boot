package com.kedar.java8features;

import com.kedar.java8features.extras.Person;

import java.util.ArrayList;
import java.util.List;

// Learned from tutorial: https://www.youtube.com/watch?v=VRpHdSFWGPs

public class NonLambdaExpressions {

    public static void main(String[] args){


        List<Person> females = new ArrayList<>();
        for(Person p: Person.persons){
            if(p.getGender().equals(Person.Gender.FEMALE)){
                females.add(p);
            }
        }

        for(Person p: females){
            System.out.println(p.toString());
        }
    }

}
