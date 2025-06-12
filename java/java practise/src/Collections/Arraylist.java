package Collections;

import java.util.ArrayList;
import java.util.Iterator;
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
        System.out.println(list.get(1));

        list.remove(4);
        System.out.println(list);

        list.remove(Integer.valueOf(6));

        list.clear();
        System.out.println(list);


        List<Integer> newlist2 = new ArrayList<>();
        newlist2.add(34);
        newlist2.add(36);
        newlist2.add(37);
        newlist2.add(32);
        newlist2.add(38);
        newlist2.add(31);
        newlist2.add(30);
        newlist2.add(12);
        newlist2.add(23);

        for (int i = 0; i < newlist2.size(); i++) {
            System.out.println(newlist2.get(i));

        }
        System.out.println("by for each");
        for(Integer element:newlist2){
            System.out.println(element);

        }

       //Iterator
        Iterator<Integer> it = newlist2.iterator();
        while (it.hasNext()){
            System.out.println("iterator"+ it.next());
        }
    }
}
