package com.example.tasks.testingTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Smith", 33));
        users.add(new User("Nora", "Anderson", 31));
        users.add(new User("Ean", "Reno", 23));

        printName(users,user -> user.getLastName().startsWith("E"));
        printName(users,user -> true);

    }


    private static void printName (List<User> users, Predicate<User> p){
        for (User user : users){
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }




}
