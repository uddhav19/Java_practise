package Collections;

import java.util.List;
import java.util.Stack;

public class StackEx {

    public static void main(String[] args){
        Stack<String > animals = new Stack<>();
        animals.push("dog");
        animals.push("horse");
        animals.push("bull");
        animals.push("cow");

        System.out.println("stack"+ animals);

        //tocheck the wich elemnt is on the top
        System.out.println(animals.peek());

        System.out.println(animals.pop());
        System.out.println("stack after pop "+ animals);

        System.out.println(animals.isEmpty());
     }
}
