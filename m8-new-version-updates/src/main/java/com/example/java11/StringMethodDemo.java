package com.example.java11;

public class StringMethodDemo {
    public static void main(String[] args) {

        var str = " Mike \n Leo \n Alex \n Dan";

        str.lines().forEach(System.out::println); // convert lines to stream




    }
}
