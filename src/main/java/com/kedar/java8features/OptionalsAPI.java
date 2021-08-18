package com.kedar.java8features;

import java.util.Optional;

public class OptionalsAPI {

    // Learned from: https://www.youtube.com/watch?v=1xCxoOuDZuU
    // https://dzone.com/articles/java-8-optional-usage-and-best-practices


    public static void main(String[] args) {

        Optional<String> opt = Optional.of("eire");
        Optional<String> emptyOpt = Optional.empty();
        Optional<String> nullOpt = Optional.ofNullable(null);
        String tem = "sdfsdf";
        System.out.println(opt.isPresent());
        opt.ifPresent(a -> {
            String upper = a.toUpperCase();
            if(upper.length() > 5){
                System.out.println("String content is: "+upper);
            }else
                System.out.println("String content is: "+a);

        });
        System.out.println(emptyOpt.isPresent());
        System.out.println("Value of nullable optional is: "+Optional.ofNullable(null).orElse("helll"));
        System.out.println("Value of nullable optional is: "+Optional.ofNullable(null).orElseGet(() -> {
            if(Math.random() > 10.0 ){
                return "helll";
            }else
                return "heaven";
            }));
        if(nullOpt.isPresent()){
            System.out.println("Value of nullable optional is: "+nullOpt.get());
        }
    }
}
