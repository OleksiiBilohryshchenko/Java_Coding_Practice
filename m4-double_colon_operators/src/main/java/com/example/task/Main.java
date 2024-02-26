package com.example.task;


import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Calculate sum = (x,y) -> System.out.println(x+y);

        Calculate sum1 = (x,y) -> Calculator.findSum(x,y);

        // Reference to a static method
        Calculate sum2 = Calculator::findSum;
        sum2.calculate(10,20);

        // Reference to an instance method
        // Calculator obj = new Calculator();
        // Calculate sum3 = obj ::findMultiply;
        Calculate sum4 = new Calculator()::findMultiply;

        BiFunction<String,Integer,String> func = (str,i) -> str.substring(i);
        BiFunction<String,Integer,String> func2 = String::substring;
        String result2 = func2.apply("Hello, World!", 7);
        System.out.println(result2);

        Function<Integer, Double> b = new MyClass()::method;
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method;

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display1 = System.out::println;



    }

}
