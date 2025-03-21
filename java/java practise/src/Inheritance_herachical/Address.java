package Inheritance_herachical;

import java.util.Scanner;

public class Address {
    int pincode;
    String city,state;

    Scanner sc=new Scanner(System.in);

    void acceptproperties(){
        System.out.println("enter pincode: ");
        pincode = sc.nextInt();
        System.out.println("enter city: ");
        city = sc.next();
        System.out.println("enter state: ");
        state = sc.next();


    }

}
