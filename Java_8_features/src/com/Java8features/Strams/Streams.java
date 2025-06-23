package com.Java8features.Strams;

import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {
        int[] arr= {5,8,3,5,2,4};

        //imperative approach
       /* int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] % 2 ==0){
                sum+= arr[i];
            }

        }*/


        //using streams
        int sum1 = Arrays.stream(arr)  // Create stream from int array
                .filter(n -> n% 2==0)  // Keep only even numbers
                .sum();  // Sum them
        System.out.println(sum1);

    }
}
