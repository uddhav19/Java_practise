package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {

//        ArrayList<String> name = new ArrayList();
//        name.add("uddhav");
//        System.out.println(name);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        System.out.println(list);

        list.add(2,8);
        System.out.println(list);

        List<Integer> newlist = new ArrayList<>();
        newlist.add(50);

        list.addAll(newlist);
        System.out.println(list);
    }
}
