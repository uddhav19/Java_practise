package Inheritance_multilevel;

public class C extends B{
    void getdata (){
        System.out.println("it is C class");

    }

    public static void main(String[] args) {
        C c= new C();
        c.display();
        c.put();
        c.getdata();
    }
}
