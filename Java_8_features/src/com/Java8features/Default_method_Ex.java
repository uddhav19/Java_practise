package com.Java8features;



interface Parent {
    void hey(); // abstract method


    default void sayhello() {  //default method
        System.out.println("default method ");
    }
}

class child implements Parent{

    @Override
    public void hey() {
        System.out.println("abstarct method");


    }
}

public class Default_method_Ex {

    public static void main(String[] args) {
        child ch = new child();
        ch.hey();
        ch.sayhello();
    }

}
/*
    A default method lets you add a method with a body (implementation) inside an interface.

    Before Java 8, all interface methods had to be abstract — no body allowed.*/