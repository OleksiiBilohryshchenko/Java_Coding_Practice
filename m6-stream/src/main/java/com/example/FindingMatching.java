package com.example;

import com.example.task.Dish;
import com.example.task.DishData;

import java.util.Optional;

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



    }


}
