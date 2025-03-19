package java_programs;

public class Constructor_overloading {
    int a,b;
    Constructor_overloading(){
        a=10;
        b=203;

    }
    Constructor_overloading(int a,int b){
        this.a=a;
        this.b=b;


    }
    Constructor_overloading(double a, double b){
        this.a=(int)a;
        this.b=(int)b;
    }
    void add(){
        System.out.println("sum= "+(a+b));
    }

    public static void main(String[] args) {
        Constructor_overloading obj1 = new Constructor_overloading();
        Constructor_overloading obj2 = new Constructor_overloading(3,5);
        Constructor_overloading obj3 = new Constructor_overloading(3.14,5.5);
        obj1.add();
        obj2.add();
        obj3.add();


    }
}
