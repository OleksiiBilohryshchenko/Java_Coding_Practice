package com.example.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream <Employee> readAll(){
        return Stream.of(
                new Employee(100,"Kevin","kevin@gmail.com", Arrays.asList("7737738383","8847738833")),
                new Employee(101,"Mike","mike@gmail.com", Arrays.asList("7737738585","8847738636")),
                new Employee(102,"Joe","joe@gmail.com", Arrays.asList("7737738888","8847888833"))
        );
    }



}
