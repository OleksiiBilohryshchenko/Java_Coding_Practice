package com.example.task;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {

    private int empId;  // .stream Stream<>
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumber; // .stream Stream<String>  --- flatMap() stream of stream method


}
