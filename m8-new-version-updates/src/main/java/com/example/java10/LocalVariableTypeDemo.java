package com.example.java10;

import java.util.Arrays;
import java.util.List;

public class LocalVariableTypeDemo {
    public static void main(String[] args) {

        //Type inference

        var str = "Java";
        var number = 5;

        byte x = 1;
        var y = 1; //int

        var price = 12.50;

        var numbers  = Arrays.asList(3,4,5,6);

        var sum = 0;
        for (var eachNumber : numbers){
            sum = sum+eachNumber;
        }


    }
}
