package com.Java8features.Strams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2_filter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,23434,9,0,33,2,1,0);
        List<Integer> filteredlist = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n->n/2)
                .distinct()  //distict used to remove duplicate elements from a stream
                .sorted((a,b)->(b-a))  //sorted used to sort the stream - in ascending and descending
                .limit(4)   //how many elements we want from starting
                .skip(1)        //how many elemnts wants to skip from starting
                .collect(Collectors.toList());
        System.out.println(filteredlist);




//        List<Integer> mappedlist = filteredlist.stream().map(n -> n / 2).collect(Collectors.toList());
//        System.out.println(mappedlist);


        List<Integer> collect = Stream.iterate(0, x -> x + 1)

                .limit(100)
                .skip(1)
                .filter(n -> n % 2 == 0)
                .map(n->n/10)
                .distinct()
                .sorted()
                .peek(x-> System.out.println(x))
                .collect(Collectors.toList());


        System.out.println("..............................");


        Integer i = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x / 20).distinct().max((a, b) -> (a - b)).get();
        System.out.println(i);

        System.out.println("..............................");

        Long count1= Stream.iterate(0, x -> x + 1).limit(101).map(x -> x / 20).distinct().count();
        System.out.println(count1);

        System.out.println("..............................");

        List<Integer> arraylist = Arrays.asList(1,2,3,4,5,4,6,9,6,7);
        Stream<Integer> integerStream = arraylist.parallelStream();//  does opearation parallely by assigning thredas
        integerStream.forEach(System.out::println);
    }
}
