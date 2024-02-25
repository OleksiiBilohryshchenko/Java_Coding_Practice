package com.example.tasks;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() { // AppleHeavyPredicate class
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };











    }


}
