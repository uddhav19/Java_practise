package java_programs;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        int num, rev=0, temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        num=sc.nextInt();
        temp=num;
        while (num>0){
            int rem = num%10;
            rev= rev*10+rem;
            num=num/10;

        }
        num=temp;
        if (num==rev){
            System.out.println("no is palindrome");
        }else {
            System.out.println("no is not palindrome");
        }
    }
}
