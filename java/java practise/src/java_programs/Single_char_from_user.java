package java_programs;

import java.util.Scanner;

public class Single_char_from_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character:");
        char ch = sc.next().charAt(0);
        System.out.println("ch="+ch);
    }
}
