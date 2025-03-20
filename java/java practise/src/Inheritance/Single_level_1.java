package Inheritance;

public class Single_level_1 extends  single_level{
    void display(){
        num = 30;
        System.out.println("num= "+num);
        System.out.println("it is child(single_level_1) class");
    }
    public static void main(String[] args){
        Single_level_1 obj = new Single_level_1();
        obj.show();
        obj.display();
    }
}
class single_level {

    int num =10;
    void show(){
        System.out.println("num= "+num);
        System.out.println("it is parent (single_level) class");

    }
}
