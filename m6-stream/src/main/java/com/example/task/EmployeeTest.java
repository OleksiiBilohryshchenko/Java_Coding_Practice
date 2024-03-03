package com.example.task;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeTest {

    public static void main(String[] args) {

        // Print all emails
        System.out.println("Print All Emails");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail) // map(employee -> employee.getEmpEmail())
                .forEach(System.out::println);

        System.out.println("Print All Phone Numbers");
        EmployeeData.readAll()
                //.flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }


}
