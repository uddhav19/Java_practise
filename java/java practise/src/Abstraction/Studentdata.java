package Abstraction;

import java.util.Scanner;

public class Studentdata extends Student{
    Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        Studentdata s= new Studentdata();
        s.accept();
        s.display();


    }
    @Override
    void accept() {
        System.out.println("enter roll no: ");
        roll=sc.nextInt();
        System.out.println("enter name: ");
        name=sc.next();
        System.out.println("enter city: ");
        city= sc.next();

    }
}
