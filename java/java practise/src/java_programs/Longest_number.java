package java_programs;

import java.util.Scanner;

public class Longest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("enter 3 numbers: ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println(n1+"is largest number than"+n2+"&"+n3);

        }else if (n2>n1&&n2>n3){
            System.out.println(n2 + "is largest number than" + n1 + "&" + n3);


        }else if (n3>n1&&n3>n2){
            System.out.println(n3 + "is largest number than" + n1 + "&" + n2);


        }else {
            System.out.println("all numbers are equal");
        }
    }
}
