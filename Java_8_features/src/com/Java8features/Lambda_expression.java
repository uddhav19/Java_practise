package com.Java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda_expression {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Running in a thread!");
        new Thread(r).start();



        List<String> names = Arrays.asList("Uddhav", "Aniket", "Vaishnavi");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println(names);

        // Using lambda expressions to define the operations of function interface
        Myinterface add = (a, b) -> a + b;
        System.out.println(add.operation(6, 3));





    }
}
