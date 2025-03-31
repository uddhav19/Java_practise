package Abstraction;

public abstract class Student {
    int roll;
    String name, city;
    abstract void accept();
    void display(){
        System.out.println("student roll no:"+ roll);
        System.out.println("student name:"+name);
        System.out.println("student city:"+city);

    }
}
