package superkeyword;
class Base2{
    int num=12;
    Base2(){
        System.out.println("num= "+num);
    }
    Base2(int a,int b){
        System.out.println("sum= "+(a+b));
    }
}
public class Parentclassconstructor extends Base2{
    int num=30;
    Parentclassconstructor(){
        System.out.println("num= "+num);

    }
    Parentclassconstructor(int a,int b){
        super(a,b);
        System.out.println("sum="+(a+b));
    }

    public static void main(String[] args) {
        Parentclassconstructor p = new Parentclassconstructor();
        Parentclassconstructor p1 = new Parentclassconstructor(2,5);
    }
}
