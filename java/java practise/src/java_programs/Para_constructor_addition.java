package java_programs;

import java.util.Scanner;

public class Para_constructor_addition {
    int a,b;
    Para_constructor_addition(int n1,int n2){
        a= n1;
        b=n2;



    }
    void add(){
        System.out.println("sum= "+(a+b));
    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        a=sc.nextInt();
        System.out.println("enter 2nd number: ");
        b=sc.nextInt();
        Para_constructor_addition obj = new Para_constructor_addition(a,b);
        obj.add();


    }
}
