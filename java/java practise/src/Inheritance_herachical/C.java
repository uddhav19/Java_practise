package Inheritance_herachical;

public class C extends A {
    void getdata(){
        System.out.println("it is C class");
    }

    public static void main(String[] args) {
        C c= new C();
        c.display();
        c.getdata();
        B b= new B();
        b.display();
        b.put();
    }



}


class B extends A{
    void put(){
        System.out.println("it is B class");
    }
}


class  A{
    void display(){
        System.out.println("it is A class");
    }

}
