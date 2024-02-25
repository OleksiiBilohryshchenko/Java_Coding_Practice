package com.example.tasks;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() { // AppleHeavyPredicate class
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };


        System.out.println("*********PREDICATE***********");

        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(20));

        lesserThan = i -> i == 5;
        System.out.println(lesserThan.test(5));

        System.out.println("*********CONSUMER***********");

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);


        System.out.println("*********BI CONSUMER***********");
        BiConsumer <Integer, Integer> addTwo = (x,y) ->System.out.println(x+y);
        addTwo.accept(1,2);

        System.out.println("*********FUNCTION***********");
        Function<String,String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Class"));


    }


}
