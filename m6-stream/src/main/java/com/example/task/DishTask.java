package com.example.task;

import java.util.Comparator;

public class DishTask {

    public static void main(String[] args) {

        // Print all dishes names that have less than 400 calories
        System.out.println("Print all dishes names that have less than 400 calories");
        DishData.getAll().stream().
                filter(dish->dish.getCalories()<400)
                .map(Dish::getName)
                //.map(dish->dish.getName())
                .forEach(System.out::println);

        // Print the length of the name of each dish
        System.out.println("Print the length of the name of each dish");
        DishData.getAll().stream()
                .map(Dish::getName)
                //.map(dish->dish.length())
                .map(String::length)
                .forEach(System.out::println);

        // Print three high caloric dish name (>300)
        System.out.println("Print three high caloric dish name (>300)");
        DishData.getAll().stream().filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);


        // Print all dish name that are below 400 calories in sorted order
        System.out.println("Print all dish name that are below 400 calories in sorted order");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);






    }

}
