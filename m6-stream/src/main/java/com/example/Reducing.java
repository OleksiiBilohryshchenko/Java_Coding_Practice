package com.example;

import com.example.task.Dish;
import com.example.task.DishData;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(4,5,3,9);
//        int sum = 0;
//        for (Integer number : numbers) {
//            sum = sum + number;
//        }

        //int result = numbers.stream().reduce(0,(a,b) -> a+b);
        int result = numbers.stream().reduce(0, Integer::sum);
        System.out.println(result);

        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b);
        System.out.println(result2.get());

        System.out.println("Dish calories total");
        //Optional<Integer> calTotal = ...
        int calTotal = DishData.getAll().stream().map(Dish::getCalories).reduce((a,b) -> a+b).get();
        System.out.println(calTotal);

        // Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println(min.get());
        System.out.println(max.get());
        System.out.println(sum.get());

        //Count -how many
        System.out.println("Count");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);

    }


}
