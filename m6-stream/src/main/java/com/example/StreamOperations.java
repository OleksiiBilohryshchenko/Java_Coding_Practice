package com.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,2,3,4);
//        list.forEach(System.out::println);

        // Intermediate operations

        // Filter (filter based on the condition, searching data)
        System.out.println("Filter");
        list.stream().filter(i -> i%2 == 0).forEach(System.out::println);

        // Distinct (unique elements)
        System.out.println("Distinct");
        Stream<Integer> str= list.stream().filter(i->i%2==0).distinct();
        str.forEach(System.out::println);

        // Limit (limit showing elements)
        System.out.println("Limit");
        list.stream().filter(i->i%2==0).limit(1).forEach(System.out::println);

        // Skip (skip element)
        System.out.println("Skip");
        list.stream().filter(i->i%2==0).skip(1).forEach(System.out::println);

        // Map (manipulate each object, change characteristics of the object)
        System.out.println("Map");
        list.stream().filter(i->i%2==0).map(i->i*3).forEach(System.out::println);

    }


}
