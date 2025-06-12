package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_classEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(89);
        list.add(12);
        System.out.println("min element "+ Collections.min(list));
        System.out.println("max element"+ Collections.max(list));
        System.out.println(Collections.frequency(list,5));

        //sorting
        Collections.sort(list);
        System.out.println(list);

        //sorting in reverse order
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
