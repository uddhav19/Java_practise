package java_programs;

import java.util.Scanner;

public class input_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = sc.nextInt();
        System.out.println("enter number 2");
        int num2 = sc.nextInt();
        System.out.println("addition of 2 numbers is:"+(num1+num2));
    }
}
