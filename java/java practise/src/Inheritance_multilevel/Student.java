package Inheritance_multilevel;

import java.util.Scanner;

public class Student {
    protected int roll;
    String name;
    Scanner sc = new Scanner(System.in);
    void accept(){
        System.out.println("enter student roll no:");
        roll=sc.nextInt();
        System.out.println("enter student name:");
        name = sc.next();

    }
}
