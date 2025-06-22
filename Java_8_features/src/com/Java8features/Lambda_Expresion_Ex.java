package com.Java8features;

interface Emploee{
    String getname();

}


public class Lambda_Expresion_Ex {
    public static void main(String[] args) {
        Emploee s = ()-> "software engineer";
        //it is lambda expression - (noting but a implementation of single abstraction inside functional interface)
        System.out.println(s.getname());


    }
}
