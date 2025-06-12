package Collections;

import java.util.Arrays;

public class ArrayclassEx {
    public static void main(String[] args) {
        int[] numbers={5,7,8,34,56,23,3};
        int index= Arrays.binarySearch(numbers,8);
        System.out.println("indexof number is"+index);

        Arrays.sort(numbers);
        for (int i:numbers){
            System.out.print(i+" ");
        }
    }
}
