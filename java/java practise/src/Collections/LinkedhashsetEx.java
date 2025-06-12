package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhashsetEx {
    public static void main(String[] args) {

        //all elemnts in insertion order
        Set<Integer> newset= new LinkedHashSet<>();

        newset.add(4);
        newset.add(2);
        newset.add(7);
        newset.add(5);
        newset.add(5); //ignore the repeated element

        System.out.println(newset);

        newset.remove(5);
        System.out.println(newset);


        System.out.println(newset.contains(10));
        System.out.println(newset.size());
        System.out.println(newset.isEmpty());
    }
}
