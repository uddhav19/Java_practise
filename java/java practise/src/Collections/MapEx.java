package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String,Integer> n = new HashMap<>();
        n.put("one",1);
        n.put("two", 2);
        n.put("three",3);
        System.out.println(n);
    }
}
