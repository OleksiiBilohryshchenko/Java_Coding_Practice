package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        // Creating Stream from Array
        String[] courses = {"Java", "Spring", "Agile"};

        Stream<String> courseStream = Arrays.stream(courses);

        // Creating Stream from Collection

        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");

        Stream <String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java",100),
                new Course("Spring",150),
                new Course("Agile",200)
        );

        Stream<Course> myCourseStream = myCourses.stream();

        // Creating stream values

        Stream<Integer> stream = Stream.of(1,2,3,4); // since v.9




    }

}
