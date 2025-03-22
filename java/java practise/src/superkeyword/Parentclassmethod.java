package superkeyword;

class Base1{
    int num = 10;
    void display(){
        System.out.println("num ="+num);
    }

}

public class Parentclassmethod extends Base1{
    int num=20;
    void display(){
        super.display();
        System.out.println("num= "+num);
    }

    public static void main(String[] args) {
        Parentclassmethod p = new Parentclassmethod();
        p.display();
    }

}
