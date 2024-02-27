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

        // Filter
        System.out.println("Filter");
        list.stream().filter(i -> i%2 == 0).forEach(System.out::println);

        // Distinct
        System.out.println("Distinct");
        Stream<Integer> str= list.stream().filter(i->i%2==0).distinct();
        str.forEach(System.out::println);

    }


}
