package java_programs;

import java.util.Scanner;

public class Parameterise_constructor {
    int roll;
    String name;
    Parameterise_constructor(int r,String n){
        roll=r;
        name= n;

    }
    void display(){
        System.out.println("rollno= "+roll+"\nname= "+name);
    }

    public static void main(String[] args) {
        int r;
        String n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rollno: ");
        r=sc.nextInt();
        System.out.println("enter name: ");
        n=sc.next();
        Parameterise_constructor u = new Parameterise_constructor(r,n);
        u.display();

    }
}
