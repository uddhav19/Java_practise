package Inheritance_Sinlge;

import java.util.Scanner;

public class Student {
    int roll;
    String name, city;

    Scanner sc = new Scanner(System.in);
    void accept(){
        System.out.println("enter student roll no:");
        roll = sc.nextInt();
        System.out.println("enter student name:");
        name = sc.next();
        System.out.println("enter student city:");
        city = sc.next();
    }
}
