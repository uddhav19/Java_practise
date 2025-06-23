package com.Java8features.Strams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple,banana, cherry");
        Stream<String> stream = list.stream();     ///alt+enter - to introduce local variable
        System.out.println(stream);

        String[] Array = {"apple, "};
    }
}
