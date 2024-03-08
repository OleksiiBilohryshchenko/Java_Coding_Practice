package com.example.java13;

public class TextBlockDemo {
    public static void main(String[] args) {

        var address = "2219 W Belden Ave \n" +
                "Chicago,IL 60647";

        System.out.println(address);

        var address2 = """
                2219 W Belden Ave
                Chicago,IL 60647
                """;

        System.out.println(address2);

    }
}
