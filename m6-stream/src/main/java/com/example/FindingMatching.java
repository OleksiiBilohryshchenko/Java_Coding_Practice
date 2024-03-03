package com.example;

import com.example.task.Dish;
import com.example.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {


    public static void main(String[] args) {

        System.out.println("allMatch - boolean (true) if all match");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);


        System.out.println("anyMatch - boolean (true) if any match");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("noneMatch - boolean (true) if none match");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>= 1000);
        System.out.println(isHealthy2);

        System.out.println("findAny - return type is optional");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("findFirst - return first match");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish2.get());

        //Parallel streams (Async) -> Reactive Programming
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Mark", "Leo", "Alex", "John", "Kent", "Lucy", "Lana", "Mary", "Victoria");
        List<String> list2 = Arrays.asList("Mark", "Leo", "Alex", "John", "Kent", "Lucy", "Lana", "Mary", "Victoria");

        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("L")).findFirst();
        Optional<String> findAny = list1.parallelStream().filter(s -> s.startsWith("L")).findAny();

        System.out.println(findFirst);
        System.out.println(findAny);


    }


}
