package com.Java8features;


interface A{
    static void sayhello(){
        System.out.println("hello ");
    }

    default void hey(){
        System.out.println("hey");
    }
}
public class static_methodsininterface implements A{

    public static void main(String[] args) {
        A.sayhello();  //only can call by intraface name

        static_methodsininterface b = new static_methodsininterface();
        b.hey();  //calling default method


    }
}

