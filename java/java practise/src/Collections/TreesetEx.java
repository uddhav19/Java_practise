package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreesetEx {

    public static void main(String[] args) {
        //all elemnts in sorted form
        Set<Integer> newset= new TreeSet<>();

        newset.add(4);
        newset.add(2);
        newset.add(7);
        newset.add(5);
        newset.add(5); //ignore the repeated element

        System.out.println(newset);

        newset.remove(5);
        System.out.println(newset);


        System.out.println(newset.contains(10));
    }
}
