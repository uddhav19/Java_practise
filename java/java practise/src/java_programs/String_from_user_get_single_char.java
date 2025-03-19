package java_programs;

import java.util.Scanner;

public class String_from_user_get_single_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str;
        System.out.println("enter a string");
        String str = sc.nextLine();
        System.out.println("str="+str);
        char ch = str.charAt(2);
        System.out.println("ch="+ch);

    }
}
